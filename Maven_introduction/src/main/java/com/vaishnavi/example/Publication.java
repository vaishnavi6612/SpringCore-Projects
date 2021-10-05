package com.vaishnavi.example;

public class Publication {
	private int publicationid;
	private String publicationname;

	public static void addPublication(int publicationid,String publicationname) 
	{
		 this.publicationid=publicationid;
		 this.publicationname=publicationname;
	}
      public void showPublication()
      {
    	  System.out.println("Publication Id:"+publicationid);
    	  System.out.println("Publication Name:"+publicationname);
      }
}
