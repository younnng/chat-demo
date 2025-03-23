package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.beans.chat.ChatCallRequest;
import com.example.demo.beans.chat.ChatCallResponse;
import com.example.demo.beans.common.CommonResult;
import com.example.demo.service.IAIService;

import jakarta.annotation.Resource;
import reactor.core.publisher.Flux;

/**
 * @ClassName: ChatController
 * @Description: ai对话相关api接口
 * @author: cly
 * @date: 2025年3月23日20:39:43
 * @version: V1.0.0
 */
@RestController
@RequestMapping("/chat")
public class ChatController {

	@Resource
	private IAIService aiService;

	/**
	 * 流式会话
	 */
	@PostMapping("/stream/message")
	public Flux<String> generateStream(@RequestBody ChatCallRequest chatRequest) {
		// userId暂时不使用
		return aiService.ollamaChatStream(chatRequest.getMessage());
	}

	/**
	 * 同步会话
	 */
	@PostMapping("/message")
	public CommonResult<ChatCallResponse> generateMessage(@RequestBody ChatCallRequest chatRequest) {
		return CommonResult
				.ok(ChatCallResponse.builder().reply(aiService.ollamaChatCall(chatRequest.getMessage())).build());
	}

	/**
	 * 历史会话
	 */
	@GetMapping("/history")
	public CommonResult<List<String>> messageHistory() {
		// TODO 获取token, 根据token获取历史数据
		return CommonResult.ok(new ArrayList<>());
	}

}
