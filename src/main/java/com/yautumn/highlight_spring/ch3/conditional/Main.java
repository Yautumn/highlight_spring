package com.yautumn.highlight_spring.ch3.conditional;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
	@SuppressWarnings("resource")
	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConditionConfig.class);
	ListService listService = context.getBean(ListService.class);
	System.out.println(context.getEnvironment().getProperty("os.name") + "命令：" + listService.showListCmd());
    }
}
