package com.elina;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

// class to use Spring annotation to configure instead of using .xml file
// this file performs all the configuration in web.xml
// and the class DemoConfig.class performs all the function in previous demo-servlet.xml
// which is no longer needed
public class FrontController extends AbstractAnnotationConfigDispatcherServletInitializer{

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		// TODO Auto-generated method stub
		return new Class[] {DemoConfig.class};
	}

	@Override
	protected String[] getServletMappings() {
		// TODO Auto-generated method stub
		return new String[] {"/"};
	}

}
