package com.yautumn.highlight_spring.ch3.taskexecutor;

import java.util.concurrent.Executor;

import org.springframework.aop.interceptor.AsyncUncaughtExceptionHandler;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.AsyncConfigurer;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

@Configuration
@ComponentScan("com.yautumn.highlight_spring.ch3.taskexecutor")
public class TaskExecutorConfig implements AsyncConfigurer {
    
    public Executor getAsyncExecutor() {
	ThreadPoolTaskExecutor threadPoolExecutor = new ThreadPoolTaskExecutor();
	threadPoolExecutor.setCorePoolSize(5);
	threadPoolExecutor.setMaxPoolSize(10);
	threadPoolExecutor.setQueueCapacity(25);
	threadPoolExecutor.initialize();
	return threadPoolExecutor;
    }
    
    public AsyncUncaughtExceptionHandler getAsyncUncaughtExceptionHandler() {
	return null;
    }
}
