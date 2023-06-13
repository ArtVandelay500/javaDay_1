package com.mycompany.study.ch07.first;

public class DmbCellphone extends Cellphone{


	final int channel = 5;
	void turnOnDmb() {
		powerOn();
		System.out.println("채널" + channel + "을 킵니다") ;
	}
	
//	void changeChannelDmb(int channel) {
//	
//		System.out.println("채널"+ channel +"로 바꿉니다");
//	}
	
	void changeChannelDmb() {
		System.out.println("채널"+ channel +"로 바꿉니다");	
	}
	
	
	void turnOffDmb() {
		System.out.println("DMB 방송을 수신합니다");
	}
	
	
	void bell(String ringTone) {
		System.out.println("새롭게 overriden 된 ring()의 벨소리 " + ringTone + "입니다");
	}
	
	void bell() {
		System.out.println("overriden completed!");
	}
	
	@Override
	void powerOff() {
		System.out.println("hey yo finally");
		// TODO Auto-generated method stub
		super.powerOff();
	}
		
	
	
	
}

