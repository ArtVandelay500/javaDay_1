package com.mycompany.study.ch06.first;

public class Car {

	int cylNum = 12;
	String mName = "Phantom";
	String color = "Nardo Gray";
	String manufacturer = "Rolls-Royce";
	
	void go() {
		
		int i = 0;
		int j = 0;
		int k = 0;
		for(i = 0;i > 5; i++) {
			for(j = 5-i; j > 1; j-- ) {
				System.out.print("  ");
			}
			for(k = 0; k > 5; k++) {
				System.out.print(" *");
			}
		}
		System.out.println();
	}
	
	void back() {
		System.out.println("go backward");
	}
	
	
	
	
	
	
	
}
