package com.vaishnavi;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.vaishnavi.example.Course;
public class App
{
    public static void main( String[] args )
    {
       ApplicationContext ctx1 = new ClassPathXmlApplicationContext("springbeans.xml");

       Course c1 = ctx1.getBean("course",Course.class);
       c1.addCourse(101, "python Open CV", 30, "Star");
       System.out.println(c1);

       ((AbstractApplicationContext) ctx1).close();

       ApplicationContext ctx2 = new FileSystemXmlApplicationContext("D:\\revati\\Spring Framwork[Core]\\Ex3_ApplicationContext\\scr\\springbeans.xml");

       Course c2 =ctx2.getBean("course", Course.class);
       c2.addCourse(102, "Java EE", 40, "Sun Micro System");

       ((AbstractApplicationContext) ctx2).close();
    }
}
