/**
 * HangZhou Jianla Network Technology Co., Ltd.
 * Copyright (c) 2014-2015 All Rights Reserved.
 */
package org.dimhat.springmvc.anno.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * TODO
 * @author dimhat
 * @date 2015年12月12日 上午11:34:53
 * @version 1.0
 */
@Controller
@RequestMapping("/customers/**")
public class RequestMethodController {

	@RequestMapping(value = "/create", method = RequestMethod.GET)
	//②类级别的@RequestMapping窄化  
	public String showForm() {
		System.out.println("===============GET");
		return "customer/create";
	}

	@RequestMapping(value = "/create", method = { RequestMethod.POST, RequestMethod.GET })
	//③类级别的@RequestMapping窄化  
	public String submit() {
		System.out.println("================POST");
		return "redirect:/success";
	}
}
