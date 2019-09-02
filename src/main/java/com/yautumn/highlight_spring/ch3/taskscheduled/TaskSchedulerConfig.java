package com.yautumn.highlight_spring.ch3.taskscheduled;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

@Configuration
@ComponentScan("com.yautumn.highlight_spring.ch3.taskscheduled")
@EnableScheduling
public class TaskSchedulerConfig {

}
