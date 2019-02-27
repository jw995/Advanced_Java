package com.elina;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan({"com.elina"})
public class DemoConfig {
	
	@Bean
	public InternalResourceViewResolver viewRosolver() {
		InternalResourceViewResolver vr = new InternalResourceViewResolver();
		vr.setPrefix("/WEB-INF/");    // the file should be under WEB-INF folder
		vr.setSuffix(".jsp");
		
		return vr;
	}
}
