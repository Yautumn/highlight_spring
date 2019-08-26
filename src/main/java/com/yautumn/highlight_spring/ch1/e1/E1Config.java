package com.yautumn.highlight_spring.ch1.e1;

import java.io.IOException;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;
import org.springframework.core.io.Resource;

@Configuration
@ComponentScan("com.yautumn.highlight_spring.ch1")
@PropertySource("classpath:com/yautumn/highlight_spring/ch1/e1/test.properties")
public class E1Config {
	@Value("I Love You!")
	private String normal;
	
	@Value("#{systemProperties['os.name']}")
	private String osName;
	
	@Value("#{T(java.lang.Math).random()*100.0}")
	private double randomNumber;
	
	@Value("classpath:com/yautumn/highlight_spring/ch1/e1/test.txt")
	private Resource testFile;
	
	@Value("#{demoService.another}")
	private String fromAnother;
	
	@Value("http://www.baidu.com")
	private Resource testUrl;
	
	@Value("${book.name}")
	private String bookName;
	
	@Autowired
	private Environment environment;
	
	@Bean
	public static PropertySourcesPlaceholderConfigurer propertyConfigurer() {
		return new PropertySourcesPlaceholderConfigurer();
	}
	public void outputResource() {
		try {
			System.out.println(normal);
			System.out.println(osName);
			System.out.println(randomNumber);
			System.out.println(fromAnother);
			System.out.println(IOUtils.toString(testFile.getInputStream(),"UTF-8"));
			System.out.println(IOUtils.toString(testUrl.getInputStream(),"UTF-8"));
			System.out.println(bookName);
			System.out.println(environment.getProperty("book.author"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
