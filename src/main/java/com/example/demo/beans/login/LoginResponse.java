package com.example.demo.beans.login;

import lombok.Builder;
import lombok.Data;
import lombok.experimental.Tolerate;

/**
 * @ClassName: LoginResponse
 * @Description: 登录响应体
 * @author: cly
 * @date: 2025年3月23日21:10:06
 * @version: V1.0.0
 */
@Data
@Builder
public class LoginResponse {
	/**
	 * 认证信息
	 */
	private String token;
	/**
	 * 基础用户信息
	 */
	private User user;

	@Data
	@Builder
	public static class User {
		private String id;
		private String username;
		private Boolean isAdmin;

		@Tolerate
		public User() {
		}
	}

	@Tolerate
	public LoginResponse() {
	}

}
