package com.example.demo.beans.login;

import lombok.Data;

/**
 * @ClassName: LoginRequest
 * @Description: 登录请求体
 * @author: cly
 * @date: 2025年3月23日21:08:21
 * @version: V1.0.0
 */
@Data
public class LoginRequest {
	/**
	 * 账号
	 */
	private String username;
	/**
	 * 密码
	 */
	private String password;

}
