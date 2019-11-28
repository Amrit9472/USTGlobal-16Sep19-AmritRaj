package com.ustglobal.hasarelation.weak;

public class RelationCarMusic {
	public static void main(String[] args) {
		Car c = new Car();
		System.out.println(c.name);
		System.out.println(c.color);
		c.drive();
		System.out.println("Music info");
		
		c.ms.play();
	}

}
