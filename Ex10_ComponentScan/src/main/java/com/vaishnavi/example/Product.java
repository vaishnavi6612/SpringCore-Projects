package com.vaishnavi.example;

import org.springframework.stereotype.Component;

@Component
public class Product {
	private int productid;
	private String prodname;
	private float price;
	
	public void setProductid(int productid) {
		this.productid = productid;
	}
	
	public void setProdname(String prodname) {
		this.prodname = prodname;
	}
	
	public void setPrice(float price) {
		this.price = price;
	}
	
	public int getProductid() {
		return productid;
	}
	
	public String getProdname() {
		return prodname;
	}
	
	public float getPrice() {
		return price;
	}
	
	@Override
	public String toString() {
		return "Product [productid = "+ productid + ", prodname = "+ prodname+ ", price = "+ price +"]";
	}
}
