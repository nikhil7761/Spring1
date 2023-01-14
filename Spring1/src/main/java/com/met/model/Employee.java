package com.met.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="Employeetbl")
public class Employee {
	
	@Id
	private int id;
	private String name;
	private String designation;
	private String Emailid;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesignation() {
		return designation;
	}
	
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getEmailid() {
		return Emailid;
	}
	public void setEmailid(String emailid) {
		Emailid = emailid;
		
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int id, String name, String designation, String emailid) {
		super();
		this.id = id;
		this.name = name;
		this.designation = designation;
		Emailid = emailid;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", designation=" + designation + ", Emailid=" + Emailid + "]";
	}
	
	
	

}
