package com.example.demo.service;

import reactor.core.publisher.Flux;

/**
 * @ClassName: IAIService
 * @Description: ai模型相关能力封装
 * @author: cly
 * @date: 2025年3月23日20:40:13
 * @version: V1.0.0
 */
public interface IAIService {

	/**
	 * 流式响应
	 */
	Flux<String> ollamaChatStream(String message);
	
	/**
	 * 同步响应
	 */
	String ollamaChatCall(String message);

}
