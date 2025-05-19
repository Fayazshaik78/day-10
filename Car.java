package com.vehicles;

public class Car {
private String brand;
private String model;
private double price;

public void setBrand(String brand) {
	this.brand = brand;
	
}
public void setName(String model) {
	this.model = model;
		
}
public void setPrice(double price) {
	this.price=price;
	
}
public String getBrand() {
	return brand ;
	
}
public String getModel() {
	return model;
	
}
public double getPrice() {
	return price;

}
public void  showCarDetails(){
	System.out.println("Car Brand : " + brand);
	System.out.println("Car model :" + model);
	System.out.println("Car price :"+ price);
	
}


}




