package com.company.admin;

public class Department {
	private String  deptName;
	private int deptId;
	
	public void setDeptName(String deptName) {
		this.deptName = deptName ;
		
	}
	public void setDeptId(int deptId) {
		this.deptId = deptId ;
		
	}
	public String getDeptName() {
		return deptName;
		
	}
	public int DeptId() {
		return deptId;
		
	}
	public void showDepartmentDetails() {
		System.out.println("Dept name :"+ deptName);
		System.out.println("Dept id :"+ deptId);
		
	}
}
