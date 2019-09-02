package com.yautumn.highlight_spring.ch3.annotation;

import org.springframework.stereotype.Service;

@Service
public class DemoService {
    public void outputResult() {
	System.out.println("从组合注解配置获取Bean");
    }
}
