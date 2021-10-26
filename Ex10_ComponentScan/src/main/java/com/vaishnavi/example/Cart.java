 package com.vaishnavi.example;

import java.util.Arrays;

import org.springframework.stereotype.Component;

@Component
public class Cart {
	private int carid;
	private String custmername;
	private String[] products;
	
	public void setCarid(int carid) {
		this.carid = carid;
	}
	
	public void setCustmername(String custmername) {
		this.custmername = custmername;
	}
	
	public void setProducts(String[] products) {
		this.products = products;
	}
	
	@Override
	public String toString() {
		return "Cart [carid="+ carid+ ",custmername=" + custmername +", products=" + Arrays.toString(products) +"]";
	}
	
}
