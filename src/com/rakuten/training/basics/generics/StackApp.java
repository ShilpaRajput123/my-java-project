package com.rakuten.training.basics.generics;

public class StackApp {

	public static void main(String[] args) {
		
		Stack<Integer> st = new FixedArrayStack<>(9);
//		Stack st= new DynaStack();
		StackUser u=new StackUser();
		
		u.fill(st);
		
	}

}
