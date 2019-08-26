package com.yautumn.highlight_spring.ch1.e1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ResourceConfig.class);
		E1Config resourceService = context.getBean(E1Config.class);
		resourceService.outputResource();
		context.close();
	}

}
