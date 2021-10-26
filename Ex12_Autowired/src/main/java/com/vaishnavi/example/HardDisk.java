package com.vaishnavi.example;

import org.springframework.stereotype.Component;

@Component
public class HardDisk {
	private String company;
	private int memorysize;
	private float price;
	
	public HardDisk()
	{
		company = "#unknowcompany";
		memorysize = 0;
		price = 0.0f;
	}
	
	public HardDisk(String company, int memorysize, float price) {
		super();
		this.company = company;
		this.memorysize = memorysize;
		this.price = price;
	}
	
	public String getCompany() {
		return company;
	}
	
	public int getMemorysize() {
		return memorysize;
	}
	
	public float getPrice() {
		return price;
	}
}
