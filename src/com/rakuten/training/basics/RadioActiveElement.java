package com.rakuten.training.basics;

public class RadioActiveElement extends ChemicalElements {

	
	int halfLife;
	public RadioActiveElement(int atomicNumber,String symbol,String name,int halflife) {
		
	   
		super(atomicNumber,symbol,name);
		this.halfLife=halfLife;
	}

	public int getHalfLife() {
		return halfLife;
	}

//	public void setHalfLife(int halfLife) {
//		this.halfLife = halfLife;
//	}
	
	
	
	
}
