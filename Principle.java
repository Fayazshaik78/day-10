package com.school.staff;

public class Principle {
	private String principleName;
	private int  experienceYears;
	public void setPrincipleName(String principleName) {
		this.principleName = principleName;
		
	}
	public void setExperiencesYears(int  experienceYears ) {
		this.experienceYears=  experienceYears;
		
	}
	public String getPrincipleName() {
		return principleName;
		
	}
	public int getExperienceYears() {
		return  experienceYears;
		
	}
	public void showPrincipalInfo()  {
		System.out.println("principle name :" +principleName );
		System.out.println("principle experiance :"+experienceYears);
		
	}

}
