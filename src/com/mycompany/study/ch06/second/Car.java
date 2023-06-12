package com.mycompany.study.ch06.second;

public class Car {

	int cylNum;
	int year;
	String mName;	
//	String mName = "Phantom";
//	String color = "Nardo Gray";
//	String manufacturer = "Rolls-Royce";
	
	void go() {
		
		System.out.println("go Forward");
	}
	
	void back() {
		System.out.println("go backward");
	}
	
	
	
	Car (int cc, int yy, String nn) {
		this.cylNum = cc;
		this.year = yy;
		this.mName = nn;
	}
	
	
	
	
	
}