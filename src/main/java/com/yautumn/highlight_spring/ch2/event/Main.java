package com.yautumn.highlight_spring.ch2.event;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    
    public static void main(String[] args) {
	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(EventConfig.class);
	DemoPublisher demoPublisher = context.getBean(DemoPublisher.class);
	demoPublisher.publisher("Hello Application event");
	context.close();
    }

}
