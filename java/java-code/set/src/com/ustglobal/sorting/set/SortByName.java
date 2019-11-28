package com.ustglobal.sorting.set;

import java.util.Comparator;

public class SortByName implements Comparator<Bank> {

	@Override
	public int compare(Bank b1, Bank b2) {
		// TODO Auto-generated method stub
		return b1.name.compareTo(b2.name);
	}

}
