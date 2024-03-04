package com.smart.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.smart.dao.UserRepository;
import com.smart.entities.Contact;
import com.smart.entities.User;

@Controller
public class HomeController {
	
//	@Autowired
//	private UserRepository userRepository;
	
	@RequestMapping("/")
	public String home(Model model) {
		model.addAttribute("title", "Home : Smart Contact Manager");
		return "home";
	}
	
	@RequestMapping("/about")
	public String about(Model model) {
		model.addAttribute("title", "About : Smart Contact Manager");
		return "about";
	}
	@RequestMapping("/signup")
	public String signup(Model model) {
		model.addAttribute("title", "Register : Smart Contact Manager");
		return "signup";
	}

//	@GetMapping("/test")
//	@ResponseBody
//	public String test() {
//		User user = new User();
//		user.setEmail("test@gmail.com");
//		user.setName("Test name");
//		user.setPassword("hello");
//		Contact contact = new Contact();
//		user.getContacts().add(contact);
//		userRepository.save(user);
//		return "This is for testing purpose only";
//	}
}