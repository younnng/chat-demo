package com.example.demo.beans.common;

import com.example.demo.common.enums.ResultCodeEnum;

import lombok.Data;

/**
 * @ClassName: CommonResult
 * @Description: 接口通用响应
 * @author: cly
 * @date: 2025年3月23日21:13:12
 * @version: V1.0.0
 */
@Data
public class CommonResult<T> {

	private Integer code;

	private String message;

	private T data;

	public static <T> CommonResult<T> ok(T data) {
		CommonResult<T> result = new CommonResult<>();
		result.setData(data);
		result.setCode(ResultCodeEnum.OK.getCode());
		result.setMessage(ResultCodeEnum.OK.getMsg());
		return result;
	}

	public static <T> CommonResult<T> error(ResultCodeEnum errorEnum) {
		CommonResult<T> result = new CommonResult<>();
		result.setCode(errorEnum.getCode());
		result.setMessage(errorEnum.getMsg());
		return result;
	}

}
