package com.library.app;
import  com.library.books.Library;
import   com.library.staff.Librarian;

public class LibraryApp {
	public static void main(String[] args) {
		
	
	Library lib = new Library();
	
	Librarian an = new Librarian();
	lib.setLibraryName("10k coders lib");
	lib.setTotalBooks(3000);
	an.setLibrarianName("Fayaz ");
	an.setYearsOfExperience(3);
	lib.showLibraryDetails();
	System.out.println();
	an.showLibrarianInfo();
	

	
	 

	
}
}
