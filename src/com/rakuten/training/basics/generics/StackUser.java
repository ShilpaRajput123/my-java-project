package com.rakuten.training.basics.generics;

public class StackUser {
  public void fill(Stack<Integer> s) {
	  for(int i=0;i<10;i++) {
		  s.push(i);//s.push(new Integer(i);
		  System.out.println("--PUSH---"+i);
		  
		  
		  
	  }
//	  Integer iObj=10;//auto-boxing---->new Integer(10);
//	  iObj++;//iObj=new Integer(iObj.intValue()++);
//	  int i=iObj;//iObj.intValue();
  }
  
}
/*
 * class Integer{ int value; public Integer(int value) {
 *  this.value=value;
 *   }
 * public int intValue() 
 * { return value; } }
 */
