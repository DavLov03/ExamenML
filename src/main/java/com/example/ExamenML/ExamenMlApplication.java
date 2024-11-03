package com.example.ExamenML;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = "com.example.ExamenML.entities")
public class ExamenMlApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExamenMlApplication.class, args);
		System.out.println("Funcionando");
	}


}
