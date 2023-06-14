package com.mycompany.study.ch02;

import java.util.Scanner;

public class ComputerExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Computer pc = new Computer();
		
		System.out.println("원의 반지름: ");
		
		Scanner sc = new Scanner(System.in);
		
		int r = sc.nextInt();
		
		System.out.println();
		System.out.println("Calculator 객체의 원면적 구하는 프로그램 실행");
		System.out.println("원면적: " + Calculator.param(r));
		System.out.println();
		System.out.println("Computer 객체의 원면적 구하는 프로그램 실행");
		System.out.println("원면적: " + pc.param(r));
		System.out.println();
		
		
	}
}
