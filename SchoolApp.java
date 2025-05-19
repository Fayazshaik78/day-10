package com.school.app;
import  com.school.management.School;
import   com.school.staff.Principle;

public class SchoolApp {
	public static void main(String[] args) {
		School school = new School();
		school.setName("noble");
		school.setLocation("mlg");
		Principle principle = new Principle();
		principle.setPrincipleName("fayaz");
		principle.setExperiencesYears(7);
		
		school.showSchoolInfo();
		System.out.println();
		principle.showPrincipalInfo();
	}
	
    
}
