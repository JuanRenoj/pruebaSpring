package com.example.pruebaSpring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

//@SpringBootApplication (exclude = {DataSourceAutoConfiguration.class})
@SpringBootApplication
public class PruebaSpringApplication extends SpringBootServletInitializer {

	public static void main(String[] args)
	{
		SpringApplication.run(PruebaSpringApplication.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure( SpringApplicationBuilder builder) {
		return builder.sources(PruebaSpringApplication.class);
	}
}
