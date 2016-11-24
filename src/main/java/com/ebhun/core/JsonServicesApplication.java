package com.ebhun.core;

import javax.jms.Queue;

import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@SpringBootApplication
@EnableWebMvc
@ComponentScan(basePackages = "com.ebhun.core")
public class JsonServicesApplication extends WebMvcConfigurerAdapter {
	public static void main(String[] args) {
		SpringApplication.run(JsonServicesApplication.class, args);
	}

	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {

		configurer.enable();
	}

	@Bean
	public Queue queueReal() {
		return new ActiveMQQueue("QA.JSON.FIRST");
	}
}
