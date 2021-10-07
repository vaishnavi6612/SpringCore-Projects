package com.vaishnavi.example;

public class Manager {
         private Employee emp;
         private Department dept;
         
         public Manager()
         {
        	 
         }
         public Manager(Employee emp,Department dept)
         {
        	 super();
        	 this.emp=emp;
        	 this.dept=dept;
         }
         public Employee getEmp()
         {
        	 return emp;
         }
         public Department getDept()
         {
        	 return dept;
         }
}
