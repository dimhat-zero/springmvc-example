/**
 * HangZhou Jianla Network Technology Co., Ltd.
 * Copyright (c) 2014-2015 All Rights Reserved.
 */
package org.dimhat.springmvc.old.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

/**
 * 以上是HandlerInterceptor1实现，HandlerInterceptor2同理 只是输出内容为“HandlerInterceptor2”。
 * @author dimhat
 * @date 2015年12月11日 下午2:47:16
 * @version 1.0
 */
public class HandlerInterceptor1 extends HandlerInterceptorAdapter {//此处一般继承HandlerInterceptorAdapter适配器即可  

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
		System.out.println("===========HandlerInterceptor1 preHandle");
		return true;
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		System.out.println("===========HandlerInterceptor1 postHandle");
	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		System.out.println("===========HandlerInterceptor1 afterCompletion");
	}

}
