package com.example.school_management;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "com.example.school_management.controller")
@EnableJpaRepositories(basePackages = "com.example.school_management.repository")
@EntityScan(basePackages = "com.example.school_management.dto")
public class SchoolManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(SchoolManagementApplication.class, args);
	}

}
