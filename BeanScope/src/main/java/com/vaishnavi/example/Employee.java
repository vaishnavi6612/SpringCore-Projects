package com.vaishnavi.example;

public class Employee {
     private int empcode;
     private String empname;
     private long salary;
     
     public void addEmployee(int empcode,String empname,long salary)
     {
    	 this.empcode=empcode;
    	 this.empname=empname;
    	 this.salary=salary;
     }
     public void showEmployee()
     {
    	 System.out.println(empcode+"\t"+empname+salary);
     }
}
