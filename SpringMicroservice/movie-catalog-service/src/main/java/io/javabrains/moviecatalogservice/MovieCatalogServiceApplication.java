package io.javabrains.moviecatalogservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

//a stand-alone spring application for movie info
@SpringBootApplication
public class MovieCatalogServiceApplication {

	@Bean
	public RestTemplate getTemplate() {
		return new RestTemplate();
	}
		
	public static void main(String[] args) {
		SpringApplication.run(MovieCatalogServiceApplication.class, args);
	}

}

