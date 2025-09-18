package com;

public class Employee {

	private int empid;
	
	private String email;
	
	private double salary;
	
	public Employee() {
		
	}

	public Employee(int empid, String email, double salary) {
		super();
		this.empid = empid;
		this.email = email;
		this.salary = salary;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", email=" + email + ", salary=" + salary + "]";
	}

}
