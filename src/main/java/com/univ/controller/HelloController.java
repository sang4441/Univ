package com.univ.controller;

import com.univ.model.Group;
import com.univ.model.User;
import com.univ.services.GroupService;
import com.univ.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {
    @Autowired
    UserService userService;
    GroupService groupService;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String printWelcome(ModelMap model) {
		model.addAttribute("message", "Hello world!");
		return "header";
	}

    @RequestMapping(value = "/signup", method = RequestMethod.GET)
    public String signUp(ModelMap model) {
        return "sign_up";

    }

    @RequestMapping(value = "/create_group_form", method = RequestMethod.GET)
    public String groupForm(ModelMap model) {
        return "create_group_form";

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
        return "header";
    }

    @RequestMapping(value = "/create_user", method = RequestMethod.POST)
//    public String createUser(@ModelAttribute("userForm") User user) {

            public String createUser(@RequestParam("email") String email,
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
        return "header";
    }
}
