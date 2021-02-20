package com.rakuten.training.basics;

public class ChemicalElementsApp {

	public static void main(String[] args) {
		
		ChemicalElements h = new ChemicalElements(1, "H", "Hydrogen");
		System.out.println("Is Hydrogen an Alkali? "+h.isAlkaliMetal());
		ChemicalElements k = new ChemicalElements(19, "K", "Potassium");
		System.out.println("Is Potassium an Alkali? "+k.isAlkaliMetal());
		ChemicalElements z = new ChemicalElements(30, "Zn", "Zinc");
		System.out.println("Is Zinc an Alkali? "+z.isAlkaliMetal());
		System.out.println("Is Zinc a Transition Metal? "+z.isTransitionMetal());
		
		
		ChemicalElements h2 = new ChemicalElements(1, "H", "Hydrogen");
		
		System.out.println("Are h and h2 same? "+(h == h2));
		System.out.println("Are h and h2 equal? "+(h.equals(h2)));
	}

}

