package com.forthenew.springstudy.web;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
@EnableWebMvc
public class ServletContext extends WebMvcConfigurerAdapter {

	@Bean(name="/hello")
	public HelloController hello(){
		HelloController hello = new HelloController();
		return hello;
	}
}
