/**
 * HangZhou Jianla Network Technology Co., Ltd.
 * Copyright (c) 2014-2015 All Rights Reserved.
 */
package org.dimhat.springmvc.old.controller;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.dimhat.springmvc.old.editor.PhoneNumberEditor;
import org.dimhat.springmvc.old.model.DataBinderTestModel;
import org.dimhat.springmvc.old.model.PhoneNumberModel;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.validation.BindException;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;

/**
 * 此处我们使用SimpleFormController；
 * showForm：展示表单，当提交表单有任何数据绑定错误会再回到该方法进行表单输入（在此处我们打印错误对象）；
 * doSubmitAction：表单提交成功，只要当表单的数据到命令对象绑定成功时，才会执行；
 * 
 * @author dimhat
 * @date 2015年12月11日 上午11:00:37
 * @version 1.0
 */
public class DataBinderErrorTestController extends SimpleFormController {

	public DataBinderErrorTestController() {
		setCommandClass(DataBinderTestModel.class);
		setCommandName("dataBinderTest");
	}

	@Override
	protected ModelAndView showForm(HttpServletRequest request, HttpServletResponse response, BindException errors)
			throws Exception {
		//如果表单提交有任何错误都会再回到表单展示页面  
		System.out.println(errors);
		return super.showForm(request, response, errors);
	}

	@Override
	protected void doSubmitAction(Object command) throws Exception {
		System.out.println(command); //表单提交成功（数据绑定成功）进行功能处理  
	}

	@Override
	protected void initBinder(HttpServletRequest request, ServletRequestDataBinder binder) throws Exception {
		super.initBinder(request, binder);
		//注册自定义的属性编辑器  
		//1、日期  
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		CustomDateEditor dateEditor = new CustomDateEditor(df, true);
		//表示如果命令对象有Date类型的属性，将使用该属性编辑器进行类型转换  
		binder.registerCustomEditor(Date.class, dateEditor);

		//自定义的电话号码编辑器  
		binder.registerCustomEditor(PhoneNumberModel.class, new PhoneNumberEditor());
	}
	/*
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		dateFormat.setLenient(false);
		binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));
	}
	*/
}
