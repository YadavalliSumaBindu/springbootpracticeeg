package com.web5.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="empsuma")
public class Employee {

	@Id
	private int e_Id;
	private String e_Name;
	private String e_Email;
	private String e_Address;
	public Employee() {
		super();
	}
	public Employee(int e_Id, String e_Name, String e_Email, String e_Address) {
		super();
		this.e_Id = e_Id;
		this.e_Name = e_Name;
		this.e_Email = e_Email;
		this.e_Address = e_Address;
	}
	public int getE_Id() {
		return e_Id;
	}
	public void setE_Id(int e_Id) {
		this.e_Id = e_Id;
	}
	public String getE_Name() {
		return e_Name;
	}
	public void setE_Name(String e_Name) {
		this.e_Name = e_Name;
	}
	public String getE_Email() {
		return e_Email;
	}
	public void setE_Email(String e_Email) {
		this.e_Email = e_Email;
	}
	public String getE_Address() {
		return e_Address;
	}
	public void setE_Address(String e_Address) {
		this.e_Address = e_Address;
	}
	@Override
	public String toString() {
		return "Employee [e_Id=" + e_Id + ", e_Name=" + e_Name + ", e_Email=" + e_Email + ", e_Address=" + e_Address
				+ "]";
	}
	
}

