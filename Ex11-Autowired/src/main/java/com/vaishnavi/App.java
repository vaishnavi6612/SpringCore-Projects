package com.vaishnavi;



import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.vaishnavi.example.Employee;
import com.vaishnavi.example.PanCard;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext ctx=new ClassPathXmlApplicationContext("springbeans.xml");
        
        Employee e1=ctx.getBean("employee",Employee.class);
        System.out.println("Employee code:"+e1.getEmpcode());
        System.out.println("Employee Name:"+e1.getEmpname());
        
        PanCard p1=e1.getPancard();
        System.out.println("Pan Card Number:"+p1.getPancardno());
        System.out.println("Pan Holder Name:"+p1.getPanholdername());
        System.out.println("Registration Date:"+p1.getRegdate());
        
        Employee e2=ctx.getBean("employee",Employee.class);
        e2.setEmpcode(145);
        e2.setEmpname("John");
        e1.getPancard().setPancardno("ABCDE1234R");
        e2.getPancard().setPanholdername("John");
        e2.getPancard().setRegdate("4/5/2018");
        
        System.out.println("Employee Code:"+e2.getEmpcode());
        System.out.println("Employee Name:"+e2.getEmpname());
        
        PanCard p2=e2.getPancard();
        System.out.println("Pan Card Number:"+p2.getPancardno());
        System.out.println("Pan Holder Name:"+p2.getPanholdername());
        System.out.println("Registration Date:"+p2.getRegdate());
 }
   
}
