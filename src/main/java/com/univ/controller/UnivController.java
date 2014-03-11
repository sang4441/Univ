package com.univ.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import com.univ.model.*;
import com.univ.services.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class UnivController {
    @Autowired GroupService groupService;
    @Autowired UserService userService;
    @Autowired EventService eventService;
    @Autowired CategoryService categoryService;
    @Autowired PostService postService;



    @RequestMapping(value = "/", method = RequestMethod.GET)
     public String printWelcome(HttpServletRequest request, ModelMap model) {
        List<Category> categories = categoryService.findTopCategories();
        model.addAttribute("categories", categories);


        HttpSession session = request.getSession();
        User user = userService.findUserById(1);
        session.setAttribute("user", user);
        session.setMaxInactiveInterval(30*60);

        return "index";
    }

    @RequestMapping(value = "/club", method = RequestMethod.GET)
    public ModelAndView findClub(ModelMap model) {
        return new ModelAndView("index", "content", "find_club");
    }

    @RequestMapping(value = "/sign_up_page", method = RequestMethod.GET)
    public ModelAndView signUp(ModelMap model) {
        return new ModelAndView("index", "content", "sign_up");
    }

    @RequestMapping(value = "/create_user", method = RequestMethod.POST)
//    public String createUser(@ModelAttribute("userForm") User user) {

    public ModelAndView createUser(@RequestParam("email") String email,
                             @RequestParam("password") String password,
                             @RequestParam("firstName") String firstName,
                             @RequestParam("lastName") String lastName,
                             Model model
    ) {

        User user = new User();
        user.setEmail(email);
        user.setFirstName(firstName);
        user.setLastName(lastName);
        user.setPassword(password);
        userService.insertUser(user);
        return new ModelAndView("index", "content", "sign_in");
    }

    @RequestMapping(value = "/sign_in_page", method = RequestMethod.GET)
    public ModelAndView signInPage(ModelMap model) {
        return new ModelAndView("index", "content", "sign_in");
    }

    @RequestMapping(value = "/signin", method = RequestMethod.POST)
    public ModelAndView signIn(
            HttpServletRequest request,
            @RequestParam("email") String email,
            @RequestParam("password") String password,
            Model model) {

        User user = userService.findUserByEmail(email);
        if (password.equals(user.getPassword())) {
            HttpSession session = request.getSession();
            session.setAttribute("user", user);
            session.setMaxInactiveInterval(30*60);
        } else {
            return new ModelAndView("redirect:sign_in_page", "err", "Login unsuccessful");
        }
        return new ModelAndView("redirect:/profile/"+user.getId(), "user", user);
    }


    @RequestMapping(value = "/log_out", method = RequestMethod.GET)
    public String logOut(
            HttpServletRequest request,
            ModelMap model) {
        HttpSession session = request.getSession();
        session.setAttribute("user", new User());
        return "redirect:/";
    }

    @RequestMapping(value = "/create_group_form", method = RequestMethod.GET)
    public ModelAndView groupForm(ModelMap model) {

        List<Category> categories = categoryService.findTopCategories();

        model.addAttribute("categories", categories);
        return new ModelAndView("index", "content", "create_group_form");
    }

    @RequestMapping(value = "/create_group", method = RequestMethod.POST)
//    public String create_group(@ModelAttribute("group") Group group) {
    public void createGroup(HttpServletRequest request,
                              @RequestParam("name") String name,
                              @RequestParam("description") String description,
                              @RequestParam("typeId") int typeId,
                              @RequestParam("categoryId") int categoryId) {
        HttpSession session = request.getSession();
        Group group = new Group();
        group.setName(name);
        group.setDescription(description);
        group.setType_id(typeId);
        group.setCategory_id(categoryId);
        group.setDate_created(new Date());
        User user = (User)session.getAttribute("user");
        group.setCreated_by(user.getId());
        groupService.createGroup(group, user.getId());
    }

    @RequestMapping(value = "/profile/{id}", method = RequestMethod.GET)
    public ModelAndView profilePage(HttpServletRequest request,
                                    ModelMap model,
                                    @PathVariable int id) {
        HttpSession session = request.getSession();
        User user = (User)session.getAttribute("user");
        List<Group> myGroups = groupService.findGroupByUserId(id);
        List<Event> myEvents = eventService.findEventbyUserId(user.getId());
        model.addAttribute("myEvents", myEvents);
        model.addAttribute("myGroups", myGroups);
        return new ModelAndView("index", "content", "profile");
    }

    @RequestMapping(value = "/group/{id}", method = RequestMethod.GET)
    public ModelAndView groupPage(HttpServletRequest request,ModelMap model, @PathVariable int id) {

        HttpSession session = request.getSession();
        User user = (User)session.getAttribute("user");
        boolean isUserAdmin = groupService.isUserAdmin(id, user.getId());
        if (isUserAdmin) {
            model.addAttribute("isAdmin", true);
        } else {
            model.addAttribute("isAdmin", false);
        }
        Group group = groupService.findGroupByGroupId(id);
        List<Event> events = eventService.findEventByGroupId(id);

        model.addAttribute("group", group);
        model.addAttribute("events", events);
        return new ModelAndView("index", "content", "group/side_nav");
    }

    @RequestMapping(value = "/group/{id}/about", method = RequestMethod.GET)
    public ModelAndView groupAboutPage(HttpServletRequest request,ModelMap model, @PathVariable int id) {
        Group group = groupService.findGroupByGroupId(id);
        model.addAttribute("group", group);
        return new ModelAndView("index", "content", "side_nav");
    }

    @RequestMapping(value = "/group/{id}/event", method = RequestMethod.GET)
    public @ResponseBody List<Event> groupEventPage(HttpServletRequest request,ModelMap model, @PathVariable int id) {
        List<Event> events = eventService.findEventByGroupId(id);
        return events;
    }

    @RequestMapping(value = "/group/{id}/chat", method = RequestMethod.GET)
    public @ResponseBody List<Post> groupChatPage(HttpServletRequest request,ModelMap model, @PathVariable int id) {
        List<Post> posts = postService.findPostByGroupId(id);

        return posts;
    }

    @RequestMapping(value = "create_post", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
    @ResponseStatus(HttpStatus.CREATED) @ResponseBody
    public void createEvent(HttpServletRequest request, @RequestBody Post post
    ) throws ParseException {
        HttpSession session = request.getSession();
        User user = (User)session.getAttribute("user");
        post.setCreated_by(user.getId());
        postService.insertPost(post);
    }

    @RequestMapping(value = "/create_event_form/{groupId}", method = RequestMethod.GET)
    public String eventForm(ModelMap model,
                            @PathVariable int groupId) {
        Group group = groupService.findGroupByGroupId(groupId);
        model.addAttribute("group", group);
        return "forms/create_event_form";
    }

    @RequestMapping(value = "create_event", method = RequestMethod.POST)
    public String createEvent(HttpServletRequest request,
                              @ModelAttribute("event") Event event,
                              BindingResult result) throws ParseException {
        HttpSession session = request.getSession();
        User user = (User)session.getAttribute("user");
        event.setCreated_by(user.getId());
        event.setDate_created(new Date());

        SimpleDateFormat event_date = new SimpleDateFormat("yyyy-M-dd hh:mm:ss");
        String dateString = event.getDate_event_string() + " " + event.getTime_event_string();
        Date date = event_date.parse(dateString);
        event.setDate_event(date);
        eventService.insertEvent(event);
        return "redirect:/group/"+event.getGroup_id()+"#event";
    }

    @RequestMapping(value = "category/{id}", method = RequestMethod.GET)
    public ModelAndView groupPages(ModelMap model, @PathVariable int id) {

        List<Group> groups = groupService.findGroupByCategoryId(id);
//        for(Group group : groups) {
//            User user = userService.findUserById(group.getLeaderId());
//            group
//        }
        List<Event> events = eventService.findEventByCategoryId(id);
        List<Category> subCategories = categoryService.findChildCategoryById(id);
        List<Category> categories = categoryService.findTopCategories();

        model.addAttribute("categories", categories);
        model.addAttribute("groups", groups);
        model.addAttribute("events", events);
        model.addAttribute("subCategories", subCategories);

        return new ModelAndView("index", "content", "find_club");
    }
}
