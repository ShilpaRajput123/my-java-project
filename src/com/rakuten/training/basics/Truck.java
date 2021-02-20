package com.rakuten.training.basics;

public class Truck extends Vehicle {
     
	@Override
	public void start() {
		System.out.println("(((((((Truck Starting)))))");
	}
	
	public void honkHorribly() {
		System.out.println("[[[[[[bbbooooommmppp]]]]]]");
		
		
	}

	@Override
	public void stop() {
		System.out.println("[[[[[[[Truck Stopping]]]]]]]]");
	}
	
	
}
