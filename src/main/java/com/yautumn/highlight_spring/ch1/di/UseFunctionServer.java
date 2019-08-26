package com.yautumn.highlight_spring.ch1.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UseFunctionServer {
	@Autowired
	FunctionServer functionServer;
	
	public String sayHello(String word) {
		return functionServer.sayHello(word);
	}
}
