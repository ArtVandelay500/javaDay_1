package com.mycompany.study.ch06.sixth;

public class Televsion {
	
	public static String company = "LG";
	public static String model = "QLED";
	public static String comapnyModel = company + ":" + model;
	public static String info;
	
	
	static {
		info = company + ":" + model;
//		abc();
//		efg();
	}
	
	public static void abc() {
		System.out.println("abc()");
	}
	public static void efg() {
		System.out.println("efg()");
	}
}
