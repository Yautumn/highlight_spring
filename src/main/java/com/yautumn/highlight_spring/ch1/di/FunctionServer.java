package com.yautumn.highlight_spring.ch1.di;

import org.springframework.stereotype.Service;

@Service
public class FunctionServer {
	public String sayHello(String word) {
		return "Hello" + word;
	}
}
