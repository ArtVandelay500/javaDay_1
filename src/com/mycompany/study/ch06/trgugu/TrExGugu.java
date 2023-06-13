package com.mycompany.study.ch06.trgugu;

import java.util.Scanner;

public class TrExGugu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TrGugu gugu = new TrGugu();
		
		
		while(gugu.ongoing == true) {
			System.out.println("숫자를 입력하세요");
			Scanner scanner = new Scanner(System.in);
			int input = scanner.nextInt();
			if(input == 0) {
				gugu.ongoing = false;
				System.out.println("프로그램 종료!");
			}else {
				gugu.num(input);
			}
			
		}
		
		
	}

}
