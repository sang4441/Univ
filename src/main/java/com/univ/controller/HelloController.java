package com.univ.controller;

import java.util.List;
import com.univ.model.Event;
import com.univ.model.Group;
import com.univ.model.User;
import com.univ.services.GroupService;
import com.univ.services.UserService;
import com.univ.services.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Controller
public class HelloController {
    @Autowired GroupService groupService;
    @Autowired UserService userService;
    @Autowired EventService eventService;


	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String printWelcome(ModelMap model) {
		model.addAttribute("message", "Hello world!");
		return "index";
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
        return new ModelAndView("redirect:/", "user", user);
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
        return new ModelAndView("index", "content", "create_group_form");
    }

    @RequestMapping(value = "/create_group", method = RequestMethod.POST)
//    public String create_group(@ModelAttribute("group") Group group) {
    public String createGroup(@RequestParam("name") String name,
                              @RequestParam("description") String description,
                              @RequestParam("typeId") int typeId,
                              @RequestParam("categoryId") int categoryId) {
        Group group = new Group();
        group.setName(name);
        group.setDescription(description);
        group.setTypeId(typeId);
        group.setCategory_id(categoryId);
        groupService.insertGroup(group);
        return "redirect:/";
    }


    @RequestMapping(value = "/create_event_form", method = RequestMethod.GET)
    public ModelAndView eventForm(ModelMap model) {
        return new ModelAndView("index", "content", "create_event_form");
    }

    @RequestMapping(value = "/create_event", method = RequestMethod.POST)
    public String createEvent(@RequestParam("title") String title,
                              @RequestParam("description") String description,
                              @RequestParam("location") String location,
                              @RequestParam("privacy_level") int privacy_level)  {
        Event event = new Event();
        event.setTitle(title);
        event.setDescription(description);
        event.setLocation(location);
        event.setPrivacy_level(privacy_level);
        eventService.insertEvent(event);
        return "redirect:/";
    }

    @RequestMapping(value = "{id}", method = RequestMethod.GET)
    public String groupPage(ModelMap model, @PathVariable int id) {

        List<Group> groups = groupService.findGroupByCategoryId(id);
        model.addAttribute("groups", groups);

        return "index";
    }
}
