package com.mycompany.study.ch13.first;

public class ExBox {

	public static void main(String[] args) {
		Box<String> box = new Box<>();
		box.content = "안녕하세요";
		String content = box.content;
		
		System.out.println(content);
		
		Box<Integer> box2 = new Box<>();
		box2.content = 95;
		int content1 = box2.content;
		System.out.println(content1);
		

	}
	
	
	

}
