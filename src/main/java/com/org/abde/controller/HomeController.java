package com.org.abde.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.org.abde.service.UserService;


@Controller
@RequestMapping("/")
public class HomeController {
	@Autowired	
	UserService userService;
@RequestMapping(path="/login",method=(RequestMethod.GET))
	 public String login(){
	
		return "login";
	}

@RequestMapping(path="/register",method=(RequestMethod.GET))
public String register(){

	return "register";
}

@RequestMapping(path="/",method=(RequestMethod.GET))
public String home(){
userService.multiply(2, 4);
System.out.println("here in controllers");
	return "index";
}
}
