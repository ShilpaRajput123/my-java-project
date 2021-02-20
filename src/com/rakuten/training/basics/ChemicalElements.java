package com.rakuten.training.basics;
public class ChemicalElements implements Comparable<ChemicalElements> {

	int atomicNumber;
	String symbol;
	String name;

	static boolean[] alkaliMetals = new boolean[120];
	
	static {
		alkaliMetals[3] = true;
		alkaliMetals[11] = true;
		alkaliMetals[19] = true;
		alkaliMetals[37] = true;
		alkaliMetals[55] = true;
		alkaliMetals[87] = true;
	}


	public ChemicalElements(int atomicNumber, String symbol, String name) {
		super();
		this.atomicNumber = atomicNumber;
		this.symbol = symbol;
		this.name = name;

		
	}

	public boolean isAlkaliMetal() {

		return alkaliMetals[atomicNumber];
	}

	public boolean isTransitionMetal() {
		return (atomicNumber >= 21 && atomicNumber <= 31)
				||(atomicNumber >= 39 && atomicNumber <= 48)
				|| (atomicNumber >= 72 && atomicNumber <= 80)
				|| (atomicNumber >= 104 && atomicNumber <= 112);
	}

	
	public boolean isMetal() {
		switch(atomicNumber) {
		case 13:
		case 49:
		case 50:
		case 81:
		case 82:
		case 83:
		case 113:
		case 114:
		case 115:
		case 116:
			return true;
		default:
			return false;
		}
	}

	public int getAtomicNumber() {
		return atomicNumber;
	}

	public String getSymbol() {
		return symbol;
	}

	public String getName() {
		return name;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + atomicNumber;
		return result;
	}
	

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ChemicalElements other = (ChemicalElements) obj;
		if (atomicNumber != other.atomicNumber)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "ChemicalElements [atomicNumber=" + atomicNumber + ", symbol=" + symbol + ", name=" + name + "]";
	}

	@Override
	public int compareTo(ChemicalElements other) {
		if(this.atomicNumber>other.atomicNumber) {
			return 1;
		}
		else if(other.atomicNumber>this.atomicNumber) {
			return -1;
		}else {
		
		return 0;
	}
		//this.atomicNumber-other.atomicNumber
		}
	
	
}
