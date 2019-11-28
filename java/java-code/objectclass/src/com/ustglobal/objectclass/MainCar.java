package com.ustglobal.objectclass;

public class MainCar {
	public static void main(String[] args) {
		Car c = new Car(500000000,"BMW","Black");
		Car c2 = new Car(540000000,"Audi","Red");
		System.out.println(c.hashCode());
		System.out.println(c);
		System.out.println(c2.hashCode());
		System.out.println(c2);

	}

}
