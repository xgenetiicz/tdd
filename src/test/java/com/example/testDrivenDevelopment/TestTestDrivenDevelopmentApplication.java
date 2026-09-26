package com.example.testDrivenDevelopment;

import org.springframework.boot.SpringApplication;

public class TestTestDrivenDevelopmentApplication {

	public static void main(String[] args) {
		SpringApplication.from(TestDrivenDevelopmentApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
