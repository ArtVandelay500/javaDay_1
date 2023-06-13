package com.mycompany.study.ch06.trgugu;

import java.util.Scanner;




public class TrGugu {

	boolean ongoing = true;
	
	public static void num(int input) {

	
//		System.out.println(input);
			
		for(int i = 1; i < 10; i++) {
			int result = input * i;
			System.out.println(input + " * " + i + " = " + result);
				
		}
		
		System.out.println("=================================");
		
		
	}
}
