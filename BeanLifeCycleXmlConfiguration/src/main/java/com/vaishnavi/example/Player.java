package com.vaishnavi.example;

	public class Player {
	      private int playerid;
	      private String playername;
	      private int scoredruns;
	      
	      public int getPlayerid() {
	      return playerid;
	      
	}
	public void setPLayerid(int playerid)
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
	public void destroy()
	{
		System.out.println("Bean Destroyed");
	}
}


