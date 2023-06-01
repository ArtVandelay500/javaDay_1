package com.mycompany.study.ch04;

public class Exif04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x = 1;
		int y = 1;
		
		
		if(x > 0 && y > 0 ) {
			System.out.println(x + "와 " + y + "는 1사분면에 위치합니다" );
		}else if(x > 0 && y < 0 ) {
			System.out.println(x + "와 " + y + "는 4사분면에 위치합니다");
		}else if(x < 0 && y < 0 ) {
			System.out.println(x + "와 " + y + "는 3사분면에 위치합니다");
		}else if(x < 0 && y > 0){
			System.out.println(x + "와 " + y + "는 2사분면에 위치합니다");
		}else if(x == 0 && y < 0){
			System.out.println(x + "와 " + y + "는 3과 4사분면 사이에 위치합니다");
		}else if(x == 0 && y > 0){
			System.out.println(x + "와 " + y + "는 1과 2사분면 사이에 위치합니다");
		}else if(x > 0 && y == 0){
			System.out.println(x + "와 " + y + "는 1과 4사분면 사이에 위치합니다");
		}else if(x < 0 && y == 0){
			System.out.println(x + "와 " + y + "는 2과 3사분면 사이에 위치합니다");
		}
		else {
			System.out.println("원점입니다");			
		}
		
		
		
		
		
		
		
		
		
		
	}

}
