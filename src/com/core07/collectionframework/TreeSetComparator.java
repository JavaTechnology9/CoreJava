package com.core07.collectionframework;

import java.util.Comparator;

public class TreeSetComparator implements Comparator<Double>{

	@Override
	public int compare(Double o1, Double o2) {
		
		return o1.compareTo(o2);
	}

}
