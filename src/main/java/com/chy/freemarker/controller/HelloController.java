package com.chy.freemarker.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.chy.freemarker.entity.User;
import com.chy.freemarker.service.IUserService;

@Controller
public class HelloController {
	
	@Autowired
	private IUserService userService;
	
	@RequestMapping(value = "/hello")
	@ResponseBody
	public String sayHello(HttpServletRequest req, @RequestParam String name){
		userService.saveUser(new User(name));
		return "Hello World";
	}
	
	@RequestMapping(value = "/sayhello")
	@ResponseBody
	public String sayhello(HttpServletRequest req, @RequestParam String name){
		userService.saveUser(new User(name));
		return "Hello World";
	}
	
	@RequestMapping(value = "index")
	public String gotoIndex(){
		return "index";
	}
	
	@RequestMapping(value = "getMessage")
	public @ResponseBody String getMessage(){
		return "{\"name\" : \"tom\"}";
	}
	
	

}
