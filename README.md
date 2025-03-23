# AI聊天助手

基于Spring Boot和Spring AI构建的智能聊天助手应用，支持流式响应和同步响应模式。

## 项目概述

本项目是一个基于Spring Boot框架开发的AI聊天应用，集成了Ollama大语言模型，提供了简洁易用的聊天界面和API接口，支持流式和同步两种对话模式。

## 技术栈

- **后端框架**：Spring Boot 3.4.4
- **AI集成**：Spring AI 1.0.0-M6 (Ollama集成)
- **Java版本**：Java 24
- **构建工具**：Maven
- **其他依赖**：Lombok, Reactor Core

## 功能特性

- **流式会话**：支持流式响应的聊天模式，实时返回AI生成内容
- **同步会话**：支持同步响应的聊天模式，一次性返回完整回复
- **历史会话**：支持查询历史会话记录（待实现）
- **用户认证**：提供用户登录接口

## 安装部署

### 前置条件

- Java 24或更高版本
- Maven 3.6或更高版本
- Ollama服务（默认地址：http://localhost:11434）

### 安装步骤

1. 克隆项目到本地

```bash
git clone [项目仓库URL]
cd chat-demo
```

2. 使用Maven构建项目

```bash
mvn clean package
```

3. 运行应用

```bash
java -jar target/demo-0.0.1-SNAPSHOT.jar
```

### 配置说明

应用默认使用`application-local.yml`配置文件，主要配置项：

```yaml
spring:
  ai:
    ollama:
      base-url: http://localhost:11434 # Ollama服务地址
      chat:
        model: deepseek-r1:1.5b # 使用的AI模型
```

可根据需要修改Ollama服务地址和使用的模型。

## API接口文档

应用默认端口为8080，上下文路径为`/ai-chat`。

### 聊天接口

#### 1. 流式会话

- **URL**: `/ai-chat/chat/stream/message`
- **方法**: POST
- **请求体**:
  ```json
  {
    "message": "你好，请介绍一下自己"
  }
  ```
- **响应**: 流式返回AI回复内容

#### 2. 同步会话

- **URL**: `/ai-chat/chat/message`
- **方法**: POST
- **请求体**:
  ```json
  {
    "message": "你好，请介绍一下自己"
  }
  ```
- **响应**:
  ```json
  {
    "code": 200,
    "message": "success",
    "data": {
      "reply": "AI回复内容"
    }
  }
  ```

#### 3. 历史会话

- **URL**: `/ai-chat/chat/history`
- **方法**: GET
- **响应**:
  ```json
  {
    "code": 200,
    "message": "success",
    "data": []
  }
  ```

### 登录接口

- **URL**: `/ai-chat/login`
- **方法**: POST
- **请求体**:
  ```json
  {
    "username": "用户名",
    "password": "密码"
  }
  ```

## 开发者

- **作者**: cly
- **版本**: V1.0.0
- **日期**: 2025年3月23日
