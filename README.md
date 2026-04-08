# Project_test1

这是一个基于 Java 的示例项目，包含以下几个模块：

## 项目内容 / Project Contents

### HelloWorld
简单的 Hello World 程序，输出 "Hello, World!" 到控制台。

A simple Hello World program that prints "Hello, World!" to the console.

### BubbleSort（冒泡排序）
实现经典冒泡排序算法，对整型数组进行升序排列，并包含早退优化（当某趟遍历未发生交换时提前结束）。

Implements the classic bubble sort algorithm for ascending integer array sorting, with an early-exit optimization when no swaps occur in a pass.

### AzureAgent（Azure 资源部署 Agent）
介绍 Azure 作为云平台的基本概念，以及使用 Azure SDK for Java 进行资源部署的工作流，包括：
- 身份认证（DefaultAzureCredential）
- 创建资源组
- 部署虚拟机等资源

Introduces Azure as a cloud platform and demonstrates the resource deployment workflow using the Azure SDK for Java, including:
- Authentication (DefaultAzureCredential)
- Creating Resource Groups
- Deploying resources such as Virtual Machines

### Main（主程序）
主入口，集成 Sentry 错误追踪，并依次调用 AzureAgent 介绍。

Main entry point that integrates Sentry for error tracking and invokes the AzureAgent introduction.

## 构建与运行 / Build & Run

本项目使用 Maven 构建：

```bash
mvn package
java -jar target/project-test1-1.0-SNAPSHOT.jar
```

## 依赖 / Dependencies

| 依赖 | 版本 | 用途 |
|------|------|------|
| `io.sentry:sentry` | 7.19.0 | 错误追踪 / Error tracking |
| `com.azure.resourcemanager:azure-resourcemanager` | 2.33.0 | Azure 资源管理 / Azure resource management |
| `com.azure:azure-identity` | 1.11.4 | Azure 身份认证 / Azure authentication |
