package com.vaishnavi;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.vaishnavi.example.Player;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext ctx=new ClassPathXmlApplicationContext("SpringBean.xml");
        
        Player p1=(Player)ctx.getBean("player");
        
        System.out.println("Player ID:"+p1.getPlayerid());
        System.out.println("Player Name:"+p1.getPlayername());
        System.out.println("Total Scored Runs:"+p1.getScoredruns());
        
        ((AbstractApplicationContext) ctx).close();
    }
}
