package com.rakuten.training.collections;

import java.util.Comparator;

import com.rakuten.training.basics.ChemicalElements;

public class ChemicalElementNameLengthComparator implements Comparator<ChemicalElements> {

	public static void main(String[] args) {
		
	}

	public int compare(ChemicalElements o1, ChemicalElements o2) {
		
		return o1.getName().length() - o2.getName().length();
	}

}

//class ChemicalElementNameComparator implements Comparator<ChemicalElements> {
//
//	public static void main(String[] args) {
//		
//	}
//
//	public int compare(ChemicalElements o1, ChemicalElements o2) {
//		
//		return o1.getName().compareTo(o2.getName());
//				}}

