package com.vaishnavi.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationManager {

	@Bean(name = "vendor")
	public Vendor createNewVendor()
	{
		return new Vendor();
	}
}
