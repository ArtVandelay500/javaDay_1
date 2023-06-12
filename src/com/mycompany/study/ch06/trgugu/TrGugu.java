package com.mycompany.study.ch06.trgugu;

import java.util.Scanner;

public class TrGugu {

	 private static int getThis = 5000;
	 
	 public static int getThisYo() {
		return getThis; 
	 }
	public static void num() {
	
//		System.out.println(input);
		boolean ongoing = true;
		
		while(ongoing) {
			
			System.out.println("숫자를 입력하세요");
			Scanner scanner = new Scanner(System.in);
			int input = scanner.nextInt();
			if(input == 0) {
				ongoing = false;
				System.out.println("프로그램 종료!");
			}else {
				for(int i = 1; i < 10; i++) {
					int result = input * i;
					System.out.println(input + " * " + i + " = " + result);
				}
			}
			
				
				
		}
		
		
		
	}
}
