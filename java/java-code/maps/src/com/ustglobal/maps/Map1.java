package com.ustglobal.maps;

import java.util.HashMap;

public class Map1 {
	public static void main(String[] args) {
		
		HashMap hm = new HashMap();
		hm.put("Amrit",998014);
		hm.put("Guru",9990000);
		hm.put("sheela",79899);
		hm.put(null,456789);
		hm.put(null,789899);
		
		System.out.println("Data "+hm);
		
		hm.put("Amrit",998014);
		System.out.println("After modify "+hm);
		
		hm.put("Ranjeet",79899);
		System.out.println("After Ranjeet"+hm);
		System.out.println("==================");
		System.out.println("After null "+hm);
		System.out.println("After adding duplicate null ");
		System.out.println(hm);
		
		Object phoneno = hm.get("sheela");
		System.out.println("value "+phoneno);
		
		System.out.println("===============");
		
		Object phoneno1 = hm.get("sheru");
		System.out.println("value "+phoneno1);
		
		System.out.println("=================");
		
		Object value = hm.remove("Amrit");
		System.out.println("value "+value);
		
		System.out.println("After removing--------------->"+hm);
		
		
		
	}
	

}
