package com.mycompany.study.ch06.third;

public class ExSUM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SUM s = new SUM();
		
		System.out.println("Result of this Addition is: " + s.sum("Apple","Pie"));
		System.out.println("Result of this Substraction is:" +s.sub(15, 10));
		System.out.println("Result of this Multiplication is:" +s.mul(15, 3));
		System.out.println("Result of this division is:" +s.div(15, 3));
		System.out.println("Result of this Exponential is:" + (int)s.exp(2, 3));
		System.out.println(s.cv("홍현욱"));	
		s.cvv("홍현욱");	
		String wow = s.pick1();
		System.out.println(wow);
	}
}
