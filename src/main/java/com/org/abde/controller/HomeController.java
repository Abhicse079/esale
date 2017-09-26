package com.org.abde.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequestMapping("/")
public class HomeController {
@RequestMapping(path="/doLogin",method=(RequestMethod.GET))
	 public String login(@RequestParam("name")String name,Model model){
	//model.ad
		return "login";
	}

@RequestMapping(path="/",method=(RequestMethod.GET))
public String home(){

	return "index";
}
}
