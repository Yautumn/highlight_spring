package com.yautumn.highlight_spring.ch1.javaconfig;

public class UseFunctionService {
	
	FunctionService functionService;
	
	public String sayHello(String word) {
		return functionService.sayHello(word);
	}

	public void setFunctionService(FunctionService functionService) {
		this.functionService = functionService;
	}
	
}
