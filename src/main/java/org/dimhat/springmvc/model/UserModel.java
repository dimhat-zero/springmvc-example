/**
 * HangZhou Jianla Network Technology Co., Ltd.
 * Copyright (c) 2014-2015 All Rights Reserved.
 */
package org.dimhat.springmvc.model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

/**
 * TODO
 * @author dimhat
 * @date 2015年12月14日 下午12:20:15
 * @version 1.0
 */
public class UserModel {

	@NotNull(message = "{username.not.empty}")
	private String username;

	@Pattern(regexp = "^[a-zA-Z_][\\w]{4,19}$", message = "{user.name.error}")
	private String value;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

}
