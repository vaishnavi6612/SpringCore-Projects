package com.vaishnavi.example;

public class Department {
       private int deptcode;
       private String deptname;
       
       public Department()
       {
    	   
       }
       public Department(int deptcode,String depname)
       {
    	   super();
    	   this.deptcode=deptcode;
    	   this.deptname=deptname;
       }
	@Override
	public String toString() {
		
		return "Department [deptcode="+deptcode+",deptname="+deptname+"]";
	}
       
}
