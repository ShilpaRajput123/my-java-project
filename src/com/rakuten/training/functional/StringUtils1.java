package com.rakuten.training.functional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

import com.rakuten.training.collections.SortDemo;

public class StringUtils1 {
	
	int instanceVar = 10;
	
	public static int eChecker(String s1,String s2){
		if(s1.contains("e") && !s2.contains("e")) {
			return -1;
		}else if(!s1.contains("e") && s2.contains("e")) {
			return 1;
		}else {
			return 0;
		}
	}

	
	public static String betterString(String s1,String s2,TwoStringPredicate decider) {
		if(decider.isFirstBetterThanSecond(s1, s2)) {
			return s1;
		}else {
			return s2;
		}
	}
	
	public static <T> List<T> allMatches(List<T> list,Predicate<T> testCondition){
		List<T> result = new ArrayList<>();
		for(T anEntry : list) {
			if(testCondition.test(anEntry)) {
				result.add(anEntry);
			}
		}
		return result;
	}
	
	
	
	
	
	public  void lambdaScopeAndLocalDemo() {
		
//		String s1 = "abc";
		int i = 42;
		Arrays.sort(SortDemo.strings, (s1,s2)->{ 
			
			this.instanceVar++;
			System.out.println(i);
			return s1.substring(0,1).compareTo(s2.substring(0,1));
		
		});
		
//		i++;
		System.out.println(Arrays.asList(SortDemo.strings));
		
		
		
	}
	
	
	public static void main(String[] args) {
		
//		Arrays.sort(SortDemo.strings, (s1,s2)-> s1.length() - s2.length());
//		System.out.println(Arrays.asList(SortDemo.strings));
//		Arrays.sort(SortDemo.strings, (s1,s2)-> s2.length() - s1.length());
//		System.out.println(Arrays.asList(SortDemo.strings));
//		Arrays.sort(SortDemo.strings, (s1,s2)-> s1.substring(0,1).compareTo(s2.substring(0,1)));
//		System.out.println(Arrays.asList(SortDemo.strings));
//		StringUtils obj = new StringUtils();
//		Arrays.sort(SortDemo.strings,obj::eChecker);
//		System.out.println(Arrays.asList(SortDemo.strings));
//		
//		String longer = ElementsUtils.betterElement("Hi","Hello", (s1, s2) -> s1.length() > s2.length());
//		System.out.println(longer);
		
		List<String> words=Arrays.asList(SortDemo.strings);
		
		 List<String> shortWords = StringUtils1.allMatches(words, s -> s.length() < 4);
		 System.out.println(shortWords);
		 List<String> wordsWithB = StringUtils1.allMatches(words, s -> s.contains("b"));
		  System.out.println(words);
		 List<String> evenLengthWords = StringUtils1.allMatches(words, s -> (s.length() % 2) == 0);
		 System.out.println(evenLengthWords);
		
	}

}