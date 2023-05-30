package com.mycompany.study.ch03;

public class ExCompareOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int a = 10;
//		int b = 20;
//		
//		while(a != b) {
//			//System.out.println(a);
//			System.out.println("In order for 'A' to become 'B', 'A' needs " + (b-a) +" much!");
//			a++;
//			boolean aaa = (a == b);
//			System.out.println(aaa);
//		}
		String str1 = "장원영";
		String str2 = "장원영";
		String str3 = new String("장원영");
		
		boolean result1 = (str1 == str2); 
		System.out.println("result1=" + result1);	// true
		
		boolean result2 = (str1 == str3); 
		System.out.println("result2=" + result2);	// false
		
		
		
	}
	

}
