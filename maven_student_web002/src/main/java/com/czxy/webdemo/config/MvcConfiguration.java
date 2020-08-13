package com.czxy.webdemo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@ComponentScan(basePackages="com.czxy.webdemo.controller")
@Configuration
public class MvcConfiguration extends WebMvcConfigurationSupport {
	/**
	 * 视图解析器
	 * @return
	 */
	@Bean
	public InternalResourceViewResolver internalResourceViewResolver(){
		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
		//前缀 jsp文件夹
		viewResolver.setPrefix("/jsp/");
		//后缀 jsp扩展名
		viewResolver.setSuffix(".jsp");
		return viewResolver;
	}


}
