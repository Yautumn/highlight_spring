package com.yautumn.highlight_spring.ch2.event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class DemoPublisher {
    @Autowired
    ApplicationContext applicationContext;
    
    public void publisher(String message) {
	applicationContext.publishEvent(new DemoEvent(this, message));
    }
}
