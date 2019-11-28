package com.ustglobal.maps;

import java.util.HashMap;

public class Map2 {
	public static void main(String[] args) {
		HashMap hm = new HashMap();
		hm.put("Amrit",998014);
		hm.put("mala",9990000);
		hm.put("sheela",79899);
		hm.put(null,456789);

		HashMap hm1 = new HashMap();
		hm1.put("deepu",7889989);
		hm1.put("riya",9789898);
		hm1.put("kriti",467789);

		boolean hasKey = hm.containsKey("mala");
		System.out.println("Has Key "+hasKey);
		
	   boolean hasValue = hm.containsValue("32423434");
	   System.out.println("Has Value "+hasValue);
	   
	   hm.putAll(hm1);
	   
	   System.out.println("==========================");
	   
	   System.out.println("After put all"+hm);
	   
	   System.out.println(hm.size());
	   
	   boolean isEmpty = hm.isEmpty();
	   System.out.println("Map is Empty "+isEmpty);
	   
	   hm.clear();
	   System.out.println("After clear "+hm);

	}

}
