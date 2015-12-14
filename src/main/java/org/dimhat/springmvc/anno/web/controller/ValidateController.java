/**
 * HangZhou Jianla Network Technology Co., Ltd.
 * Copyright (c) 2014-2015 All Rights Reserved.
 */
package org.dimhat.springmvc.anno.web.controller;

import javax.validation.Valid;

import org.dimhat.springmvc.model.UserModel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.HttpSessionRequiredException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

/**
 * TODO
 * @author dimhat
 * @date 2015年12月14日 下午12:45:18
 * @version 1.0
 */
@Controller
@SessionAttributes("currentUser")
public class ValidateController {

	@ModelAttribute("attributeName")
	public String populateModel() {
		return "哈哈哈";
	}

	@RequestMapping("/validate/hello")
	public String validate(@Valid @ModelAttribute("user") UserModel user, Errors errors) {

		if (errors.hasErrors()) {
			return "validate/error";
		}
		return "redirect:/success";
	}

	@RequestMapping("/session/login")
	public String login(Model model) {
		UserModel user = new UserModel();
		user.setUsername("init username");
		user.setValue("init value");
		model.addAttribute("currentUser", user);
		return "success";
	}

	@RequestMapping("/session/user")
	public String session(UserModel user) {
		user.setUsername("test username222");
		return "success";
	}

	@RequestMapping("/session/user2")
	public String session2(@ModelAttribute("currentUser") UserModel user) {

		user.setValue("test value333");
		return "success";
	}

	//解决未登录的session异常
	//org.springframework.web.HttpSessionRequiredException
	@ExceptionHandler(HttpSessionRequiredException.class)
	public ModelAndView sessionExceptionHandler(HttpSessionRequiredException e) {
		ModelAndView mv = new ModelAndView("exception");
		mv.addObject("exception", e);
		return mv;
	}

}