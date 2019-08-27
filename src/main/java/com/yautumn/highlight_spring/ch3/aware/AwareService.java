package com.yautumn.highlight_spring.ch3.aware;

import java.io.IOException;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Component;

@Component
public class AwareService implements BeanNameAware, ResourceLoaderAware {

    private String beanName;
    
    private ResourceLoader loader;
    
    @Override
    public void setResourceLoader(ResourceLoader resourceLoader) {
	this.loader = resourceLoader;
    }

    @Override
    public void setBeanName(String name) {
	this.beanName = name;
    }
    
    public void outputResult() {
	System.out.println("Bean的名称是：" + beanName);
	Resource resource = loader.getResource("classpath:com/yautumn/highlight_spring/ch3/aware/test.txt");
	try {
	    System.out.println("ResourceLoader加载的内容为：" + IOUtils.toString(resource.getInputStream(), "UTF-8"));
	} catch (IOException e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	}
    }

    public ResourceLoader getLoader() {
        return loader;
    }

    public void setLoader(ResourceLoader loader) {
        this.loader = loader;
    }

    public String getBeanName() {
        return beanName;
    }

}
