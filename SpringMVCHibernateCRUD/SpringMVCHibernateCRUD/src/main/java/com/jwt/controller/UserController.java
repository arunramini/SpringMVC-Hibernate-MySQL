package com.jwt.controller;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.jwt.model.Employee;
import com.jwt.model.User;
import com.jwt.service.UserService;

@Controller
public class UserController {

	private static final Logger logger = Logger
			.getLogger(UserController.class);

	public UserController() {
		System.out.println("UserController()");
	}

	@Autowired
	private UserService userService;


	@RequestMapping(value = "/user", method = RequestMethod.GET)
	public ModelAndView newContact(ModelAndView model) {
		User user = new User();
		model.addObject("user", user);
		model.setViewName("userReg");
		return model;
	}

	@RequestMapping(value = "/saveUser", method = RequestMethod.POST)
	public ModelAndView saveEmployee(@ModelAttribute User user) {
		if (user.getId() == 0) { // if employee id is 0 then creating the
			// employee other updating the employee
			userService.addUser(user);
		} else {
			//userService.updateEmployee(user);
		}
		return new ModelAndView("redirect:/");
	}
	
	@RequestMapping(value = "/login1", method = RequestMethod.POST)
	public ModelAndView login(ModelAndView model) {
			//userService.login(user);
		model.setViewName("filter");
		return model;
	}

	

}