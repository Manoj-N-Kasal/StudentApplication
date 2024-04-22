package com.ps.student;

public class Student {
	private String name;
	private int id;
	private long phone;
	private String mail;
	private String branch;
	private String loc;
	private String pwd;
	
	public Student() {
		
	}

	public String getName() {
		return name;
	}
	

	public void setName(String name) {
		this.name = name;
	}
	
	public String getLoc() {
		return loc;
	}
	
	public void setLoc(String loc) {
		this.loc = loc;
	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public Student(String name, int id, long phone, String mail, String branch, String loc,String pwd) {
		this.name = name;
		this.id = id;
		this.phone = phone;
		this.mail = mail;
		this.branch = branch;
		this.loc=loc;
		this.pwd = pwd;
	}
	
	
}
