package com.rakuten.training.functional;

@FunctionalInterface
public interface TwoElementPredicate<E> {
  boolean isFirstBetterThanSecond(E first,E second);
  public default void aDefaultMethod() {
	  System.out.println("Default!!");
  }
}
