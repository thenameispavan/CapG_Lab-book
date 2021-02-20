package com.cg.eis.bean;

public class Employee {
	private int id;
	private String name;
	private double salary;
	private String designation;
	private String insuranceScheme;
	public Employee(int id, String name, double salary, String designation) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.designation = designation;
		this.insuranceScheme = findDetails(salary, designation);
	}
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
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getInsuranceScheme() {
		return insuranceScheme;
	}
	public void setInsuranceScheme(String insuranceScheme) {
		this.insuranceScheme = insuranceScheme;
	}
	public String toString() {
		return id+"\t"+name+"\t"+salary+"\t"+designation;
	}
	public static String findDetails(double salary, String designation) {
		if(salary>5000 && salary<20000 && designation.equals("System Associate"))
			return "SchemeC"; 
		else if(salary>=20000 && salary<40000 && designation.equals("Programmer"))
			return "SchemeB"; 
		else if(salary>=40000 && designation.equals("Manager"))
			return "SchemeA"; 
		else if(salary<5000 && designation.equals("Clerk"))
			return "noScheme";
		else 
			return "invalid";

	}
	
}
