package com.yautumn.highlight_spring.ch3.conditional;

public class LinuxListService implements ListService {

    @Override
    public String showListCmd() {
	return "ls";
    }

}
