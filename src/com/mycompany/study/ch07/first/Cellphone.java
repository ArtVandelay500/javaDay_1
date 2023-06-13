package com.mycompany.study.ch07.first;

public class Cellphone {

	
	String model;
	String color;
	
	void powerOn() {
		System.out.println("전원을 켭니다");
	}
	void powerOn(String product) {
		System.out.println(product + "의 전원을 켭니다");		
	}
	void powerOff() {
		System.out.println("전원을 끕니다");
	}
	void bell() {System.out.println("벨이 울립니다");}
	
	void sendVoice(String message ) {
		System.out.println("전화를 수신합니다");
	}
	void receiveVoice (String message) {
		System.out.println("전화를 발신합니다");
	}
	void hangup() {
		System.out.println("전화를 끊습니다");
	}
}
