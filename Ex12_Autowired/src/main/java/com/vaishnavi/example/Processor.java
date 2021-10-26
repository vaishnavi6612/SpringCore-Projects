package com.vaishnavi.example;

import org.springframework.stereotype.Component;

@Component
public class Processor {
	private String processorname;
	private float price;
	
	public Processor()
	{
		processorname = "#unknownprocessor";
		price =0.0f;
	}
	
	public Processor(String processorname, float price) {
		super();
		this.processorname = processorname;
		this.price = price;
	}
	
	public String getProcessorname() {
		return processorname;
	}
	
	public float getPrice() {
		return price;
	}
}
