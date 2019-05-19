package com.grouptwo.saloon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;

import javax.servlet.annotation.WebServlet;

@SpringBootApplication
public class SaloonApplication {

	public static void main(String[] args) {

		SpringApplication.run(SaloonApplication.class, args);
	}

}

