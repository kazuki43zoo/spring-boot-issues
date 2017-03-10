package com.example;

import com.example.service.DemoService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class GhxxxxApplication {

	public static void main(String[] args) {
		SpringApplication.run(GhxxxxApplication.class, args);
	}

	@Bean
	public CommandLineRunner demo(DemoService service) {
		return args -> {
			System.out.println("Number:" + service.findNumber());
		};
	}

}
