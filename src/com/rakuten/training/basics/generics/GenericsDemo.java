package com.rakuten.training.basics.generics;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import com.rakuten.training.basics.RadioActiveElement;
import com.rakuten.training.collections.ChemicalElementNameLengthComparator;

public class GenericsDemo {
	
	public static<T> T sort(List<T> l,Comparator<? super T> c) {
		
		
		return null;
	}
	
	public static <T> T combine(T o1,T o2) {
		
		
		return null;
	}
	
	public static void printAll(List<?> l) {
//		l.add("134"); ---not allow raw type
	}
	public static double sumTheList(List<? extends Number> nList) {
//		nList.add("abc:");//not a good practice
		double sum=0;
//		nList.add(134);//read only data structure
		for(Number n:nList) {
			sum+=n.doubleValue();
		}
		return sum;
	}

	public static void main(String[] args) {
		
		
		String s= combine("hello", "world");
//		String x= combine("abc", 10);
		Integer sum= combine(10, 34);
		
		Object o=new Integer(45);
		List l=new ArrayList();
		
	//	List<Object> l=new ArrayList<Integer>();
		List<Float> fList=new ArrayList<>();
		sumTheList(fList);
		ArrayList<Integer> iList=new ArrayList<>();
		iList.add(134);
		
	//	sort(iList,new ChemicalElementNameLengthComparator());
		
		List<RadioActiveElement> reList=new ArrayList<>();
		sort(reList,new ChemicalElementNameLengthComparator());
		
	//	double sum=sumTheList(iList);
	//	iList.add("abc");
		
//	List<Object> oList=iList;
//	oList.add("abc");
//	
//	int value=iList.get(1);
//		
	}

}
