package com.rakuten.training.basics;

public class Driver {
public void testDrive(Vehicle v) {
	v.start();
	System.out.println("------Vroom------");
	
	if(v instanceof Truck) {
	
	Truck t= (Truck)v;//down-casting
	t.honkHorribly();
	}
	
	v.stop();
}
}
