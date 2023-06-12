package com.mycompany.study.ch06.trFirst;

public class Member {

	String name;
	String id;
	String pwd;
	String email;
	
	Member(String x,String y,String z, String zy){
		this.name = x;
		this.name = y;
		this.name = z;
		this.name = zy;
	}
	
	
	void lookUpEmail(int x) {
		System.out.println( x + "번째의 멤버의 E-mail을 확인하겠습니다");
	}
	void lookUpId(int y) {
		System.out.println( y + "번째의 멤버의 ID를 확인하겠습니다");
	}
	
	
}
