package com.example.demo.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.beans.common.CommonResult;
import com.example.demo.beans.login.LoginRequest;
import com.example.demo.beans.login.LoginResponse;

/**
 * @ClassName: LoginController
 * @Description: 登录接口
 * @author: cly
 * @date: 2025年3月23日21:04:22
 * @version: V1.0.0
 */
@RestController
@RequestMapping("/auth")
public class LoginController {

	@PostMapping("/login")
	public CommonResult<LoginResponse> login(@RequestBody LoginRequest loginRequest) {
		// 先硬编码一个用户, 后面切换到数据库
		return CommonResult.ok(LoginResponse.builder().token("1234567890")
				.user(LoginResponse.User.builder().username("cly").isAdmin(true).build()).build());
	}

}
