package com.rakuten.training.basics;

public class VehicleApp {

	public static void main(String[] args) {
		
		Driver d=new Driver();
		//Vehicle v=new Vehicle();
		//d.testDrive(v);
		
	    Vehicle v=new Car();
	
		Car c=new Car();
	    Truck t=new Truck();
		d.testDrive(t);
		d.testDrive(c);
	}

}
