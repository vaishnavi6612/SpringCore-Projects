package com.vaishnavi.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationManager {
	
	@Bean(name = "Processor")
	public Processor createProcessor()
	{
		return new Processor();
	}
	
	@Bean(name = "Ram")
	public Ram createRam()
	{
		return new Ram();
	}
	
	@Bean(name = "hardDisk")
	public HardDisk createHardDisk()
	{
		return new HardDisk();
	}
	
	@Bean(name = "laptop")
	public Laptop createLaptop()
	{
		return new Laptop();
	}
}
