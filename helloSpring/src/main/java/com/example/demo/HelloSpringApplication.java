package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@RestController
@EnableAutoConfiguration
class SpringBootHelloWorld {
	@RequestMapping("/")
	String home() {
		return "hello world of spring boot";
	}
}

@SpringBootApplication
public class HelloSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloSpringApplication.class, args);
	}

}
