package com.vaishnavi.example;

public class Employee {
          private int empcode;
          private String empname;
          private double salary;
          
          public Employee() {}
          
          public Employee(int empcode,String empname,double salary)
          {
        	  super();
        	  this.empcode=empcode;
        	  this.empname=empname;
        	  this.salary=salary;
          }

		@Override
		public String toString() {
			
			return "Employee[empcode="+empcode+",empname="+empname+",salary="+salary+"];";
		}
          
}
