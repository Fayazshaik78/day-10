package com.company.hr;

public class Employee {
	private int id ;
	private String name;
	private double salary;

	public void setId(int id) {
		this.id = id;
		
	}
	public void setName(String name) {
		this.name = name;
			
	}
	public void setSalary(double salary) {
		this.salary=salary;
		
	}
	public int getId() {
		return id;
		
	}
	public String getName() {
		return name;
		
	}
	public double getSalary() {
		return salary;
		
	}
	public void showEmpolyeDetails() {
		System.out.println("Employe id: " + id);
		System.out.println("Employe Name :" + name);
		System.out.println("Employe salary :"+ salary);
		
	}
	

}
