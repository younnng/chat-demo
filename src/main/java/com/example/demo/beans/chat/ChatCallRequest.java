package com.example.demo.beans.chat;

import lombok.Data;

/**
 * @ClassName: ChatCallRequest
 * @Description: 对话请求参数
 * @author: cly
 * @date: 2025年3月23日23:18:40
 * @version: V1.0.0
 */
@Data
public class ChatCallRequest {
	/**
	 * 用户ID
	 */
	private String userId;
	/**
	 * 消息详情
	 */
	private String message;
	
}
