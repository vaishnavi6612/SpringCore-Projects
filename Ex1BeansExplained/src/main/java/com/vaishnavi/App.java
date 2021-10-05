package com.vaishnavi;

import org.springframework.beans.factory.BeanFactory;

import org.springframework.beans.factory.xml.XmlBeanFactory;

import org.springframework.core.io.ClassPathResource;

import org.springframework.core.io.Resource;

import com.vaishnavi.example.Fight;

public class App
{
    public static void main( String[] args )

    {
    		Resource resource = new ClassPathResource("springbeans.xml");

    		BeanFactory beanf = new XmlBeanFactory(resource);

    		Fight f1 = (Fight)beanf.getBean("fight");

    		f1.addFightDetails(1213, "Spicejet", "Hyderabad", "Bangalore", 1100);

    		f1.showFightDetails();
    }
}
