package com.mycompany.study.ch13.first;

public class ExBox {

	public static void main(String[] args) {

		Box<String> box = new Box<>();
		box.setT("Hyun");
		
		
		Box<Integer> box2 = new Box<>();
		box2.setT(1995);
		
		Box<Double> box3 = new Box<>();
		box3.setT(3.11);
		
		System.out.println(box.getT());
		System.out.println(box2.getT());
		System.out.println(box3.getT());
		
	}
	
	


}
