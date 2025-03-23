package com.example.demo.service.impl;

import org.springframework.ai.ollama.OllamaChatModel;
import org.springframework.stereotype.Service;

import com.example.demo.service.IAIService;

import jakarta.annotation.Resource;
import reactor.core.publisher.Flux;

/**
 * @ClassName: AIServiceImpl
 * @Description: ai模型相关能力封装
 * @author: cly
 * @date: 2025年3月23日20:41:12
 * @version: V1.0.0
 */
@Service
public class AIServiceImpl implements IAIService {

	@Resource
	private OllamaChatModel ollamaChatModel;

	@Override
	public Flux<String> ollamaChatStream(String message) {
		return ollamaChatModel.stream(message);
	}

	@Override
	public String ollamaChatCall(String message) {
		return ollamaChatModel.call(message);
	}

}
