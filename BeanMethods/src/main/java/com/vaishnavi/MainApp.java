package com.vaishnavi;

import javax.naming.spi.ObjectFactory;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;


import com.vaishnavi.example.Auther;
import com.vaishnavi.example.Publication;

public class MainApp {

	public static void main(String[] args, Object aliases) {
		Resource resource =new ClassPathResource("springbeans.xml");
		
	    BeanFactory   beanf=new XmlBeanFactory(resource);
		//1
		Auther f1=(Auther)beanf.getBean("auther");
		//2
		System.out.println(beanf.containsBean("publ1"));
		System.out.println(beanf.containsBean("publ5"));
		//3
       Publication p1=beanf.getBean("publ1",Publication.class);
       p1.addPublication(12, "india Publication");
       p1.showPublication();
       //4
       System.out.println(beanf.getType("auther"));
       //5
       System.out.println(beanf.isSingleton("auther"));
       //6
       String []Aliases=beanf.getAliases("auther");
       
	      for(String R:Aliases)
          {
    	   System.out.println(R);
          }
	}

}
