package com.mycompany.study.ch06.third;

public class SUM {

	
	public String sum(String a,String b) {
		String y = a + b;
		return y;
	}
	public int sub(int a,int b) {
		int y = a - b;
		return y;
	}
	public int mul(int a,int b) {
		int y = a * b;
		return y;
	}
	public int div(int a,int b) {
		int y = a / b;
		return y;
	}
	public double exp(int a,int b) {
		double y = Math.pow(a, b);
		return y;
	}
	
	public String cv(String a) {
		String result;
		if (a == "홍현욱"){
			result = "Hyun";
		}else {
			result = "You are not Hyun! Who are you?";
		}
		return result;
	}

	public void cvv(String a) {
		switch(a) {
		case "홍현욱":
			System.out.println("He is broke!");
			break;
		default:
			System.out.println("Don't know who that is...");
			break;
		}
	}
	
	public void pick() {
		int y = 10000;
		System.out.println(y + "을 주웠습니다");
	}
	
	public String pick1() {
		String result;
		int y = 10000;
		result = y + "를 주웠습니다";
		return result;
	}
	
}
