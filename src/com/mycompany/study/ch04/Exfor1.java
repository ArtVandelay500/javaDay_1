package com.mycompany.study.ch04;

public class Exfor1 {

	
	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
		int num =  2;
		int num2 = 0;
		int num3 = 0;
		int num4 = 0;
		int number = 0;
		String ii = "" ;
		
		
		for(int i = 1; i <= 10; i++) {
			num2 += i;
		}
		System.out.println(num2);
		
		
		
		while(num < 10) {
			for(int i = 1; i < 10; i++) {
				System.out.println(num + "*" + i + "=" + num*i );
			}
			num += 1;
			System.out.println("----------------------------");
			}
		
	
		while(num3 < 9) {
		
			for(int i = 0; i < 10; i++) {
				ii += " ";
				for(int j = 0; j < 10; j++) {
					ii += "*";
					System.out.println(ii);
				}
			}
			num3 += 1;
		}
		
	
	
	for(int i = 11; i < 51; i++) {
		if(i % 2 ==0) {
			number += i;
		}
	}
	System.out.println(number);
	
	
	
	
	
	
	
	
	
	
	}
}


	
	
	
	
	
	
	
	
	

