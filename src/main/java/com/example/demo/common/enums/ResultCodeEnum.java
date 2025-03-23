package com.example.demo.common.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @ClassName: ResultCodeEnum
 * @Description: 响应码
 * @author: cly
 * @date: 2025年3月23日21:24:26
 * @version: V1.0.0
 */
@Getter
@AllArgsConstructor
public enum ResultCodeEnum {
	OK(200, "请求成功");

	private final int code;
	private final String msg;

}
