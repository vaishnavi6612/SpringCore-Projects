package com.vaishnavi.example;

import java.util.Scanner;

public class Vendor {
	private int vendorid;
	private String vendorname;
	private String emailid;
	Scanner scan = new Scanner(System.in);


	public int getVendorid() {
		return vendorid;
	}
	public void setVendorid(int vendorid) {
		this.vendorid = vendorid;
	}

	public String getVendorname() {
		return vendorname;
	}
	public void setVendorname(String vendorname) {
		this.vendorname = vendorname;
	}

	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}

	public Scanner getScan() {
		return scan;
	}
	public void setScan(Scanner scan) {
		this.scan = scan;
	}

	public void addVendor()
	{
		System.out.println("\n Enter Vendor id:");
		vendorid = scan.nextInt();

		System.out.println("\n Enter Vendor name:");
		vendorname = scan.next();

		System.out.println("\n Enter Email id:");
		emailid = scan.next();

		public String toString()
		{
			return String.format("%10d,%20s, , %20s", vendorid, vendorname, emailid);
		}

	}
}
