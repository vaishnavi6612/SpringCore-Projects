package com.vaishnavi.example;

public class Fight {
	private int fightid;
	private String fightname;
	private String form;
	private String to;
	private int distance;

public void addFightDetails(int fightid, String fightname, String form, String to, int distance)
	{
	this.fightid = fightid;
	this.fightname = fightname;
	this.form = form;
	this.to =to;
	this.distance = distance;
	}

public void showFightDetails()
	{
	System.out.println("Fight Number :" + fightid);
	System.out.println("Fight Name :" + fightname);
	System.out.println("From :" + form);
	System.out.println("To :" + to);
	System.out.println("Distance :" + distance);
	}


}
