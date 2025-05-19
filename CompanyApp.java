package com.company.app;
import  com.company.hr.Employee;
import  com.company.admin.Department ;

public class CompanyApp {
	public static void main(String[] args) {
		Employee empolyee = new Employee();
		empolyee.setName("Fayaz");
		empolyee.setId(23);
		empolyee.setSalary(2500.23);
		
		
		Department deptt = new  Department();
		deptt.setDeptName ("software");
		deptt.setDeptId (344);
		
		
		empolyee.showEmpolyeDetails();
		System.out.println();
		deptt.showDepartmentDetails();
	}
	

}
