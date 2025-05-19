package com.library.staff;

public class Librarian {

	private String  librarianName;
	private int   yearsOfExperience;
	public void setLibrarianName(String librarianName) {
		this.librarianName= librarianName;
		
	}
	public void setYearsOfExperience(int   yearsOfExperience ) {
		this. yearsOfExperience=  yearsOfExperience;
		
	}
	public String getLibrarianName() {
		return librarianName;
		
	}
	public int getYearsOfExperience() {
		return  yearsOfExperience;
		
	}
	public void showLibrarianInfo()
 {
		System.out.println("principle name :" +librarianName);
		System.out.println("principle experiance :"+yearsOfExperience);
		
	}

}
	
	

