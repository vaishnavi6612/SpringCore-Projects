package com.vaishnavi.example;

public class Engine {
          public int engineid;
          public String company;
          public float price;
          
          public void setEngine(int engineid)
          {
        	  this.engineid=engineid;
          }
          public void setCompany(String company)
          {
        	  this.company=company;
          }
          public void setPrice(float price)
          {
        	  this.price=price;
          }
		@Override
		public String toString() {
			
			return "Engine [engieid="+engineid+",company="+company+",price="+price+"]";
		}
          
}
