package com.spring.Maven_project_123;
public class student {
	String name;
	int rollno;
	String emailid;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public void display() {
		System.out.println("Name: "+name);
		System.out.println("Rollno: "+rollno);
		System.out.println("Emailid: "+emailid);
	}
}
