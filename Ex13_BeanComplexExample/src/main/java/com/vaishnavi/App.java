package com.vaishnavi;

import com.vaishnavi.example.Client;
import com.vaishnavi.example.Lawyer;

public class App 
{
    public static void main( String[] args)
        AnnotationConfigApplicationContext(ApplicationManager.class);
        
       
		Object ctx;
		Lawyer lawyer1=(Lawyer)ctx.getBean("lawyerx","Mr.Kapoor","Banglore");
		Lawyer lawyer2=(Lawyer)ctx.getBean("lawyerx","Mr.Desuaza","Banglore");
		
		Client client1=(Client)ctx.getBean("client");
		Client client2=(Client)ctx.getBean("client",101,"Smith","Pune");
		Client client3=(Client)ctx.getBean("client",102,"Peter","Delhi");
		Client client4=(Client)ctx.getBean("client",103,"Smith","Pune");
		
		DummyDatabase d=ctx.getBean("dummydatabase",DummyDatabase.class);
		d.addRecord(lawyer1,new Client[] {client1,client2});
		d.addRecord(lawyer2,new Client[] {client2,client3,client4});
		
		d.showRecords();
		System.out.println("End");
    }

	
}
