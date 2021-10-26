package com.vaishnavi;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.revati.example.Cart;
import com.revati.example.Customer;
import com.revati.example.Product;


public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext ctx = new ClassPathXmlApplicationContext("springbeans.xml");
       
       Product p1 = ctx.getBean("product", Product.class);
       p1.setProductid(191);
       p1.setProdname("Pen Drive");
       p1.setPrice(500.00f);
       
       Product p2 = ctx.getBean("product", Product.class);
       p2.setProductid(192);
       p2.setProdname("Mouse");
       p2.setPrice(800.00f);
       
       Product p3 = ctx.getBean("product", Product.class);
       p3.setProductid(193);
       p3.setProdname("Bluetooth Speaker");
       p3.setPrice(1300.00f);
       
       Customer c1 = ctx.getBean("customer", Customer.class);
       c1.SetCustid(301);
       c1.Custmername("Aditya");
       c1.City("pune");
       
       Cart mycart = ctx.getBean("cart",Cart.class);
       mycart.setCarid(201);
       
       mycart.setCustmername(c1.getCustmername());
       mycart.setProducts(new String[] {p1.getProdname(), p2.getProdname(), p3.getProdname()});
       
       System.out.println(mycart);
    }
}
