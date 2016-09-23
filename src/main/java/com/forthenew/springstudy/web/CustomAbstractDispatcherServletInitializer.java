package com.forthenew.springstudy.web;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.support.AbstractDispatcherServletInitializer;

public class CustomAbstractDispatcherServletInitializer extends AbstractDispatcherServletInitializer {

	@Override
	protected WebApplicationContext createRootApplicationContext() {
		AnnotationConfigWebApplicationContext applicationContext = new AnnotationConfigWebApplicationContext();
		applicationContext.register(RootContext.class);
		return applicationContext;
	}
	
	@Override
	protected WebApplicationContext createServletApplicationContext(){
		AnnotationConfigWebApplicationContext applicationContext = new AnnotationConfigWebApplicationContext();
		applicationContext.register(ServletContext.class);
		return applicationContext;
	}
	
	
	@Override
	protected String[] getServletMappings() {
		return new String[]{"/app/*"};
	}
}