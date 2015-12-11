/**
 * HangZhou Jianla Network Technology Co., Ltd.
 * Copyright (c) 2014-2015 All Rights Reserved.
 */
package org.dimhat.springmvc.old.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.dimhat.springmvc.old.model.DataBinderTestModel;
import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractCommandController;

/**
 * TODO
 * @author dimhat
 * @date 2015年12月11日 上午10:50:21
 * @version 1.0
 */
public class ErrorController extends AbstractCommandController {

	public ErrorController() {
		setCommandClass(DataBinderTestModel.class);
		setCommandName("command");
	}

	@Override
	protected ModelAndView handle(HttpServletRequest req, HttpServletResponse resp, Object command, BindException errors)
			throws Exception {
		//表示用户名不为空  
		errors.reject("username.not.empty");
		//带有默认错误消息  
		errors.reject("username.not.empty1", "用户名不能为空1");
		//带有参数和默认错误消息          
		errors.reject("username.length.error", new Object[] { 5, 10 }, "用户名长度错误");

		//得到错误相关的模型数据  
		Map model = errors.getModel();
		return new ModelAndView("bindAndValidate/error", model);
	}

}
