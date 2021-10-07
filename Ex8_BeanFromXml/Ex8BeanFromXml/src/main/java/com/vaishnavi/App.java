package com.vaishnavi;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.vaishnavi.example.Employee;
import com.vaishnavi.example.Manager;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext ctx=new ClassPathXmlApplicationContext("springbeans.xml");
        
        Employee e1=(Employee)ctx.getBean("emp1");
        System.out.println(e1);
        
        Manager m=(Manager)ctx.getBean("manager");
        System.out.println(m);
        
        System.out.println(m.getEmp());
        System.out.println(m.getDept());
    }
}
