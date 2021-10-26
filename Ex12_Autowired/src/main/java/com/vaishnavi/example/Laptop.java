package com.vaishnavi.example;

import org.springframework.beans.factory.annotation.Autowired;

public class Laptop {
	
	
	private Processor processor;
	
	@Autowired
	private Ram ram;
	
	@Autowired
	private HardDisk harddisk;
	
	private String laptopname;
	private float totalcost;
	
	public Laptop()
	{
		laptopname = "#unknownlaptopname";
		totalcost = 0.0f;
	}
	
	public Laptop(String laptopname) {
		this.laptopname = laptopname;
		totalcost = processor.getPrice() + ram.getPrice() + harddisk.getPrice();
	}
	
	public Processor getProcessor() {
		return processor;
	}
	
	public Ram getRam() {
		return ram;
	}
	
	public HardDisk getHarddisk() {
		return harddisk;
	}
	
	public String getLaptopname() {
		return laptopname;
	}
	
	public float getTotalcost() {
		return totalcost;
	}
	
	public void showLaptopDetails()
	{
		System.out.println("Laptop Name =" + laptopname);
		System.out.println("Total Cost =" + totalcost);
		
		System.out.println();
		
		if(processor == null)
			System.out.println("Processor Object not Instantiated");
		else
		{
			System.out.println("Processor name = "+ processor.getProcessorname());
			System.out.println("Processor Price = Rs." + processor.getPrice());
		}
		
		System.out.println();
		System.out.println("Ram Model = " + ram.getModel());
		System.out.println("Ram Price = Rs." + ram.getPrice());
		
		System.out.println();
		System.out.println("Hard Disk Company : " + harddisk.getCompany());
		System.out.println("Memory Size : " + harddisk.getMemorysize());
	}
}
