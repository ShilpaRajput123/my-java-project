package com.rakuten.training.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.rakuten.training.basics.ChemicalElements;

public class SortDemo {
	
	public static String[] strings= {"this","is","a","bunch","of","strange","words","like","xylophone","and","zoo"};
	

	public static void main(String[] args) {
		
	//	simpleStringArraySort();
	//simpleStringListSort();
	//	sortAListOfUserDefinedType();
		sortAListOfUserDefinedTypeUsingComparator();
	}


	private static void sortAListOfUserDefinedTypeUsingComparator() {
		
		ChemicalElements h=new ChemicalElements(1, "H", "Hydrogen");
		ChemicalElements k=new ChemicalElements(19, "K", "Potassium");
		ChemicalElements o=new ChemicalElements(8, "O", "Oxygen");
		ChemicalElements a=new ChemicalElements(18, "A", "Argon");
		List<ChemicalElements> cList=new ArrayList<>();
		cList.add(h);cList.add(k);cList.add(o);cList.add(a);
		System.out.println("before sorting \n"+cList);
		
//		ChemicalElementNameLengthComparator comparisonLogic=new ChemicalElementNameLengthComparator();
//		ChemicalElementNameComparator comparisonLogic=new ChemicalElementNameComparator();
//		ChemicalElementNameComparator comparisonLogic=new ChemicalElementNameComparator();
		
//		Collections.sort(cList,comparisonLogic);
		Collections.sort(cList,new Comparator<ChemicalElements>() {
			@Override
			public int compare(ChemicalElements o1, ChemicalElements o2) {
				
				return o1.getName().compareTo(o2.getName());
			}});
		
		System.out.println("after sort\n"+cList);
	}


	private static void sortAListOfUserDefinedType() {

		ChemicalElements h=new ChemicalElements(1, "H", "Hydrogen");
		ChemicalElements k=new ChemicalElements(19, "K", "Potassium");
		ChemicalElements o=new ChemicalElements(8, "O", "Oxygen");
		
		List<ChemicalElements> cList=new ArrayList<>();
		cList.add(o);cList.add(h);cList.add(k);
		System.out.println("before sorting \n"+cList);
		Collections.sort(cList);
		System.out.println("after sorting \n"+cList);
		
	}


	private static void simpleStringListSort() {
		
		List<String> sList= Arrays.asList(strings);
		System.out.println("b4 sort:\n"+sList);
		Collections.sort(sList);
		System.out.println("after sort:\n"+sList);
		
	}


	private static void simpleStringArraySort() {
		
		System.out.println("before sort\n"+Arrays.asList(strings));
//		ChemicalElements h=new ChemicalElements(1, "H", "hydrogen");
//		System.out.println(h);
//		String q="Hello"+h;
//		System.out.println(q);
		Arrays.sort(strings);
		System.out.println("after sort\n"+Arrays.asList(strings));
		
	}

}
