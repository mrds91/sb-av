package com.tm.addressvalidation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.validateAddress.domain.controller","com.tm.addressvalidation"})
public class AddressValidationApplication {

	public static void main(String[] args) {
		SpringApplication.run(AddressValidationApplication.class, args);
	}

}
