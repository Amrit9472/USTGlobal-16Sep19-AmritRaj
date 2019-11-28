package com.ustglobal.atmmachine;

public class TestA {
	public static void main(String[] args) {
		HDFC h = new HDFC();
		Machine m = new Machine();
		m.slot(h);
		System.out.println("====================");
		ICICI icici = new ICICI();
		m.slot(icici);
		System.out.println("=====================");
		SBI sbi = new SBI();
		m.slot(sbi);
	}
}
