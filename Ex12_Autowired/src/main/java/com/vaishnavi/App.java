package com.vaishnavi;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.revati.example.ApplicationManager;
import com.revati.example.Laptop;

public class App 
{
    public static void main( String[] args )
    {
      AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(ApplicationManager.class);
      
      Laptop obj1 = ctx.getBean("laptop", Laptop.class);
      
      System.out.println("Laptop Name = " + obj1.getLaptopname());
      System.out.println("Total cost  = " + obj1.getTotalcost());
      
      obj1.showLaptopDetails();
    }
}
