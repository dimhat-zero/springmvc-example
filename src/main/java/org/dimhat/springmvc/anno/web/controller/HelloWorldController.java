/**
 * HangZhou Jianla Network Technology Co., Ltd.
 * Copyright (c) 2014-2015 All Rights Reserved.
 */
package org.dimhat.springmvc.anno.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * TODO
 * @author dimhat
 * @date 2015年12月11日 下午4:19:09
 * @version 1.0
 */
@Controller
public class HelloWorldController {
	@RequestMapping(value = "/hello")
	//②请求URL到处理器功能处理方法的映射  
	public ModelAndView helloWorld() {
		//1、收集参数  
		//2、绑定参数到命令对象  
		//3、调用业务对象  
		//4、选择下一个页面  
		ModelAndView mv = new ModelAndView();
		//添加模型数据 可以是任意的POJO对象  
		mv.addObject("message", "Hello World!");
		//设置逻辑视图名，视图解析器会根据该名字解析到具体的视图页面  
		mv.setViewName("hello");
		return mv; //○3 模型数据和逻辑视图名  
	}

	@RequestMapping(value = "/pattern/{first:\\d+}-{second:\\d+}")
	public String str(@PathVariable("first") Long first, @PathVariable("second") Long second) {
		System.out.println(first + "-" + second);
		return "success";
	}
}
