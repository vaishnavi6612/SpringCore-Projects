package com.vaishnavi;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.vaishnavi.example.Vendor;
import com.vaishnavi.example.ApplicationManager;
public class App
{
    public static void main( String[] args )
    {
      AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(ApplicationManager.class);

      Vendor v1 = ctx.getBean("vendor",Vendor.class);
      v1.addVendor();
    }
}
