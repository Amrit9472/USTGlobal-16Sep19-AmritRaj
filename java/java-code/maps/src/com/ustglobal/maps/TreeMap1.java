package com.ustglobal.maps;

import java.util.Map;
import java.util.TreeMap;

public class TreeMap1 {

	public static void main(String[] args) {

		TreeMap<String, Integer> lh = new TreeMap<String, Integer>();
		lh.put("Bangalore",560068);
		lh.put("patna",800002);
		lh.put("Hariyana", 134203);
		//		lh.put(null,902993); nullpointerException

		for(Map.Entry<String, Integer> m : lh.entrySet())
		{
			String key = m.getKey();
			Integer value = m.getValue();
			System.out.println("key is "+key);
			System.out.println("Value is "+value);
			System.out.println("===============");

		}

	}


}
