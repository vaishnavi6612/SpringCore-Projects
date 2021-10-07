package com.vaishnavi;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.vaishnavi.example.Car;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext ctx=new ClassPathXmlApplicationContext("springbeans.xml");
    
    Car c1=(Car)ctx.getBean("car");
    System.out.println(c1);
}
}
