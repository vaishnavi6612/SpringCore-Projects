package com.vaishnavi.example;

public class Course {
	private int courseid;
	private String coursename;
	private String certification;
	private int duration;

	public void addCourse(int courseid, String coursename, int duration,String certification)
	{
		this.courseid = courseid;
		this.coursename = coursename;
		this.duration = duration;
		this.certification = certification;

	}

	public String toString()
	{
		return String.format("%10d,%20s, %10d, %20s", courseid, coursename, duration, certification);
	}

}
