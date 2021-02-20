package com.rakuten.training.functional;

import java.util.Arrays;
import java.util.List;

import com.rakuten.training.collections.SortDemo;

public class StringUtils {
	
	int instanceVar;

	public static void main(String[] args) {
		
		Arrays.sort(SortDemo.strings, (s1,s2)-> s1.length() - s2.length());
		System.out.println(Arrays.asList(SortDemo.strings));
		Arrays.sort(SortDemo.strings, (s1,s2)-> s2.length() - s1.length());
		System.out.println(Arrays.asList(SortDemo.strings));
		Arrays.sort(SortDemo.strings, (s1,s2)-> s1.substring(0,1).compareTo(s2.substring(0,1)));
		System.out.println(Arrays.asList(SortDemo.strings));
//		StringUtils obj=new StringUtils();
//		Arrays.sort(SortDemo.strings,obj::eChecker); 
		Arrays.sort(SortDemo.strings, StringUtils::eChecker); 
		System.out.println(Arrays.asList(SortDemo.strings));
		
		
		String longer = betterElement("Hi","Hello", (s1, s2) -> s1.length() > s2.length());
		System.out.println(longer);
		
		
		
	}

	

	public static String betterString(String s1,String s2,TwoStringPredicate decide) {
		if(decide.isFirstBetterThanSecond(s1,s2)) {
			return s1;
		}else {
			return s2;
		}
		
	}
	
	public static<T> T betterElement(T s1,T s2,TwoElementPredicate<T> decide) {
		if(decide.isFirstBetterThanSecond(s1,s2)) {
			return s1;
		}else {
			return s2;
		}
		
	}

	private static int eChecker(String s1,String s2) {
		if(s1.contains("e") && !s2.contains("e")) {
			return -1;
		}else if(!s1.contains("e") && s2.contains("e")) {
			return 1;
		}else {
			return 0;
		}
	}



	

}