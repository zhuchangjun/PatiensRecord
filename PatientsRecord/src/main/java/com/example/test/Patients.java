package com.example.test;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Patients {

	@Id	
	private int pid;
	private String fname;
	private String lname;
    private String dob;

    public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	@Override
	public String toString() {
		return "Patients [pid=" + pid + ", fname=" + fname + ", lname=" + lname + ", dob=" + dob + "]";
	}

    
}
