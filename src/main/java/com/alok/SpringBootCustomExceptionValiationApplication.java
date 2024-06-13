package com.alok;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/emp")
@SpringBootApplication
public class SpringBootCustomExceptionValiationApplication {

	

	public static void main(String[] args) {
		SpringApplication.run(SpringBootCustomExceptionValiationApplication.class, args);
	}

}
