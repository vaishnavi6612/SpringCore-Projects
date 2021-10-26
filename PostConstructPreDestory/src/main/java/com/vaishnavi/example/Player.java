package com.vaishnavi.example;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

	public class Player {
	      private int playerid;
	      private String playername;
	      private int scoredruns;
	      
	      public int getPlayerid() {
	      return playerid;
	      
	}
	public void setPlayerid(int playerid)
	{
		this.playerid=playerid;
	}
	public String getPlayername() {
		return playername;
	}
	public void setPlayername(String playername)
	{
		this.playername=playername;
	}
	public int getScoredruns() {
		return scoredruns;
	}
	public void setScoredruns(int scoredruns) {
		this.scoredruns=scoredruns;
	}
	
	@PostConstruct
	public void init()
	{
		System.out.println("Bean setting properties");
	}
	@PreDestroy
	public void destroy()
	{
		System.out.println("Bean Destroyed");
	}
}


