package com.chy.freemarker.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONObject;
import com.chy.freemarker.entity.User;
import com.chy.freemarker.service.IUserService;

@Controller
public class UserController {
	
	private IUserService userService;
	
	@RequestMapping(value = "/forward/login")
	public String forwardLogin(){
		return "login";
	}
	
	@RequestMapping(value = "/user/login", method = RequestMethod.POST)
	public @ResponseBody String doLogin(@RequestParam String name, @RequestParam String password){
		User user = new User(name, password);
		JSONObject json = new JSONObject();
		try {
			userService.validateUser(user);
			json.put("000", "登陆成功");
		} catch (Exception e) {
			json.put("001", e.getMessage());
		}
		return json.toJSONString();
	}
	
	@RequestMapping(value = "/forward/register")
	public String forwardRegister(){
		return "register";
	}
	
	@RequestMapping("/user/register")
	public String doRegister(@RequestParam String name, @RequestParam String password){
		User user = new User(name, password);
		userService.saveUser(user);
		return "redirect:/login";
	}
	
	@RequestMapping("/forward/showMusic")
	public String forward(){
		return "showMusic";
	}

}
