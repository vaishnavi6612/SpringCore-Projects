package com.vaishnavi;

import java.util.LinkedHashMap;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.sun.security.ntlm.Client;
import com.vaishnavi.example.Lawyer;

@Component
public class DummyDatabase{
   @Autowired
  @Qualifier(value="mapobj")
   private LinkedHashMap<Lawyer,Client[]>records;
   
   public void addRecord(Lawyer lawyer,Client[] data)
   {
	   records.put(lawyer, data);
   }
   public void showRecords()
   {
	   Set allKeys=records.keySet();
	 
	
	for(Object k:allKeys)
	   {
		   Lawyer obj1=(Lawyer)k;
		   System.out.println(obj1);
		   
		   Client []arr=(Client[])records.get(k);
		   
		   for(Client R:arr)
		   {
			   System.out.println("\t"+R);
		   }
	   }
   }
}
