package com.rakuten.training.basics;

public class PrimitiveVsReference {
    public static void increment(int someInt) {
    	someInt++;
    }
    
    public static void increment(int[] someArray) {
    	someArray[0]++;
    }
    
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          int aPrimitive=10;
          increment(aPrimitive);
          System.out.println(aPrimitive);
          int[] aRef=new int[31];
          aRef[0]=10;
          increment(aRef);
          System.out.println(aRef[0]);
          
	}

}
