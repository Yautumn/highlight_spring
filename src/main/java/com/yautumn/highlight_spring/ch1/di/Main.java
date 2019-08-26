package com.yautumn.highlight_spring.ch1.di;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DiConfig.class);
		UseFunctionServer useFunctionServer = context.getBean(UseFunctionServer.class);
		System.out.println(useFunctionServer.sayHello(" di"));
		context.close();
	}

}
