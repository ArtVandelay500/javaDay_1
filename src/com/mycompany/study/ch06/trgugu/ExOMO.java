package com.mycompany.study.ch06.trgugu;

import java.util.Scanner;

public class ExOMO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		OMO omo = new OMO();
		
		while(omo.yn) {
			System.out.println("숫자값을 입력하세요!");
			Scanner sc = new Scanner(System.in);
			int input = sc.nextInt();
			if(input == 0) {
				omo.yn = false;
				System.out.println("프로그램을 종료합니다!");
			}else {
				omo.cal(input);
			}
		}
	
		
		
		
		
		
		
		
		
		
		
		
	}

}
