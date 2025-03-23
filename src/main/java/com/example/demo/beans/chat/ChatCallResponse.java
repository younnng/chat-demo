package com.example.demo.beans.chat;

import lombok.Builder;
import lombok.Data;
import lombok.experimental.Tolerate;

/**
 * @ClassName: ChatCallResponse
 * @Description: 同步响应体
 * @author: cly
 * @date: 2025年3月23日23:47:30
 * @version: V1.0.0
 */
@Data
@Builder
public class ChatCallResponse {
	/**
	 * 响应结果
	 */
	private String reply;

	@Tolerate
	public ChatCallResponse() {
	}

}
