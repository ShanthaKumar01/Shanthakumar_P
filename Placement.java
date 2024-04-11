package com.santhakumar.placementService;

import jakarta.persistence.Column;
import jakarta.persistence.Id;

public class Placement {
	@Id
	@Column(name="pid")
	private int pid;

	@Column(name="stuname")
	private String stuname;
	
	@Column(name="address")
	private String comp_name;

	public int getpid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getstuname() {
		return stuname;
	}
	public void setstuname(String stuname) {
		this.stuname = stuname;
	}
	public String getcomp_name() {
		return comp_name;
	}
	public void setcomp_name(String comp_name) {
		this.comp_name = comp_name;
	}
	
	public Placement() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Placement(int cid, String stuname, String comp_name) {
		super();
		this.pid = pid;
		this.stuname = stuname;
		this.comp_name = comp_name;
	}
	@Override
	public String toString() {
		return "Placement [pid=" + pid + ", studentname=" + stuname + ", companyname=" + comp_name + "]";
	}
	

}
