package com.vehicles.app;
import  com.vehicles.Car;
import   com.vehicles.parts.Engine;

public class CarApp {
	public static void main(String[] args) {
		Car car = new Car();
		car.setBrand("bmw");
		car.setName("2003");
		car.setPrice(20000.230);
	Engine eng = new Engine();
	eng.setEngineType("strong");
	eng.sethorsepower(250);
	
	
	car.showCarDetails();
	System.out.println();
	eng.showEngineDetails();
	}

	

}
