package com.vaishnavi.example;

public class Auther {
	private int autherid;
	private String authername;

     public static void addAuther(int autherid,String authername) 
     {                 
               this.autherid=autherid;
                this.authername=authername;
	}
     public void showAuther()
     {
    	 System.out.println("Auther Id:"+autherid);
    	 System.out.println("Auther Name:"+authername);
     }

}
