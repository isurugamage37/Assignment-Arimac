package com.test.abc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = "com.test.abc.model.domain")
public class AbcApplication {

	public static void main(String[] args) {

		SpringApplication.run(AbcApplication.class, args);
	}

}
