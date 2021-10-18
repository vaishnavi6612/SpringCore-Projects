package com.vaishnavi.example;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {
      private int empcode;
      private String empname;
      
      @Autowired
      private PanCard pancard;
      
      public void setEmpcode(int empcode)
      {
    	  this.empcode=empcode;
      }
      public void setEmpname(String empname)
      {
    	  this.empname=empname;
      }
     
      public int getEmpcode()
      {
    	  return empcode;
      }
      public String getEmpname()
      {
    	  return empname;
      }
      public PanCard getPancard()
      {
    	  return pancard;
      }
      public void setPancard(PanCard pancard)
      {
    	  this.pancard=pancard;
    	  }
      }
