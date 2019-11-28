package com.ustglobal.sorting.set;

import java.util.Comparator;

public class SortByNameC implements Comparator<Customer>{

	@Override
	public int compare(Customer c1, Customer c2) {
		// TODO Auto-generated method stub
		return c1.name.compareTo(c2.name);
	}

}
