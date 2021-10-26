package com.vaishnavi;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.revati.example.Message;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext ctx = new ClassPathXmlApplicationContext("springbeans.xml");
    	
    	Message m1 = ctx.getBean("message",Message.class);
    		
    	System.out.println(m1.getMsg());
    	
    	((AbstractApplicationContext) ctx).close();
    }
}
