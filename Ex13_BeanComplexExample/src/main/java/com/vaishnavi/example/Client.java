package com.vaishnavi.example;

import org.springframework.stereotype.Component;

@Component
public class Client {
     private int clientid;
     private String clientname;
     private String casedescr;
     
     public Client()
     {
    	 clientid=0;
    	 clientname="#unknownclientname";
    	 casedescr="#unknowncasedescr;";
     }
     public Client(int clienid,String clientname,String casedescr)
     {
    	 super();
    	 this.clientid=clientid;
    	 this.clientname=clientname;
    	 this.casedescr=casedescr;
     }
	@Override
	public String toString() {
		
		return "Client[clientid="+clientid+",clientname="+clientname+",casedescr="+casedescr+"]";
	}
     
}
