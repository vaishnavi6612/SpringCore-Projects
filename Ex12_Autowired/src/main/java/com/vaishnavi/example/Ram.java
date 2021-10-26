package com.vaishnavi.example;

import org.springframework.stereotype.Component;

@Component
public class Ram {
	private String model;
	private float price;
	
	public Ram() {
		model = "#unknownmodel";
		price = 0.0f;
	}
	
	public Ram (String model, float price) {
		super();
		this.model = model;
		this.price = price;
	}
	
	public String getModel() {
		return model;
	}
	
	public float getPrice() {
		return price;
	}
}
