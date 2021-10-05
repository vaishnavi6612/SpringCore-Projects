package com.vaishnavi;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.vaishnavi.example.Employee;

public class MainApp {

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("springbeans.xml");
		
		System.out.println("\n Singleton...");
		
		Employee e1=ctx.getBean("empbean1",Employee.class);
		Employee e2=ctx.getBean("empbean1",Employee.class);
		Employee e3=ctx.getBean("empbean1",Employee.class);
		
		e1.addEmployee(1234, "Smith", 70000L);
		e2.addEmployee(1765, "John", 90000L);		
		e3.addEmployee(1342, "Peter", 90000L);
			
		e1.showEmployee();
		e2.showEmployee();
		e3.showEmployee();
		
		System.out.println("\n Prototype...");
		Employee e4=ctx.getBean("empbean2",Employee.class);
		Employee e5=ctx.getBean("empbean2",Employee.class);
		Employee e6=ctx.getBean("empbean2",Employee.class);
		
		e4.addEmployee(1762, "Smith", 70000L);
		e5.addEmployee(1076, "John", 27000L);
		e6.addEmployee(1345, "Peter", 83000L);
		
		e5.showEmployee();
		e4.showEmployee();
		e6.showEmployee();
	}

}
