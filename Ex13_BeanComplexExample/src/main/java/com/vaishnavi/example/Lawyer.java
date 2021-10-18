package com.vaishnavi.example;

import org.springframework.stereotype.Component;

@Component
public class Lawyer {
       private String lawyername;
       private String location;
       
       public Lawyer()
       {
    	   lawyername="#unknownlawyername";
    	   location="#unknownlocation";
       }
       public Lawyer(String lawyername,String location)
       {
    	   super();
    	   this.lawyername=lawyername;
    	   this.location=location;
       }
	@Override
	public String toString() {
		
		return "Lawyer [lawyername="+lawyername+",location="+location+"]";
	}
       
}
