package com.example.heroku;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HerokuApplication {

	public static void main(String[] args) {
		SpringApplication.run(HerokuApplication.class, args);
	}


	@RequestMapping(value = "/test", method = RequestMethod.GET, produces = "application/json")
	public String test() {
		return "Test done Amine";
	}
}
