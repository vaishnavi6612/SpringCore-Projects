package com.vaishnavi.example;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Message implements InitializingBean, DisposableBean{
	
	private String msg;
	
	public Message() {}
	
	public Message(String msg) {
		super();
		this.msg = msg;
	}
	
	public String getMsg() {
		return msg;
	}
	
	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	public void destroy() throws Exception{
		 System.out.println("Bean Destroyed");
	}
	
	public void afterPropertiesSet() throws Exception{
		System.out.println("Bean is going to set Properties");
	}
}
