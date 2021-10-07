package com.vaishnavi.example;

public class Car {
         public String carname;
         public String color;
         public float fuelcap;
         public Engine e;
         
         public void setCarname(String carname)
         {
        	 this.carname=carname;
        	 
         }
         public void serColor(String color)
         {
        	 this.color=color;
        	 
         }
         public void serFuelcape(float fuelcap)
         {
        	 this.fuelcap=fuelcap;
        	 
         }
         public void setE(Engine e)
         {
        	 this.e=e;
         }
		@Override
		public String toString() {
			return "Car[carname="+carname+",color="+color+",fuelcap="+fuelcap+",e="+e+"]";
			
		}
         
         
}
