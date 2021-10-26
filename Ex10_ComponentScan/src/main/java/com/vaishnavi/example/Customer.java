package com.vaishnavi.example;

import org.springframework.stereotype.Component;

@Component
public class Customer {
	private int custid;
	private String custmername;
	private String city;
	
	public void SetCustid(int custid) {
		this.custid = custid;
	}
	
	public void Custmername(String custmername) {
		this.custmername = custmername;
	}
	
	public void City(String city) {
		this.city = city;
	}
	
	public int getCustid() {
		return custid;
	}
	
	public String getCustmername() {
		
		return custmername;
	}
	
	public String getCity() {
		return city;
	}
	
	@Override
	public String toString() {
		return "Customer [custid = "+ custid + ", custmername = "+ custmername + ", city = "+ city+"]";
	}
}
