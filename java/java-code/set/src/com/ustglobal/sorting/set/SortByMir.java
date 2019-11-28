package com.ustglobal.sorting.set;

import java.util.Comparator;

public class SortByMir implements Comparator<Bank> {

	@Override
	public int compare(Bank b1, Bank b2) {
		// TODO Auto-generated method stub
		if(b1.micr>b1.micr)
			return 1;
		else if(b1.micr< b2.micr)
			return -1;
		else 
		return 0;
		
	}

}
