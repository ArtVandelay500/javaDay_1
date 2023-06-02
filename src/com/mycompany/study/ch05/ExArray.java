package com.mycompany.study.ch05;

public class ExArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
//		double sum [];
//		double avg [];
//		String grade[];
//		char grade2022[];
//		
//		int[] scoreChemistry = {100,80,69,70,95};
//		String[] scoreStudent = {"A" ,"B", "C","D","E"};		
//		char[] arrayA = {'A','B','C','D','E'};
//		
//		
//		
//		
//		int len = scoreStudent.length;
//		
//		for(int i = 0; i < len; i ++) {
//			System.out.println(scoreStudent[i]);
//		}
//		
//		System.out.println();
//		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
//		System.out.println();
//		
//
//		for(int num: scoreChemistry) {
//			System.out.println(num);
//		}
//		
		
//		int i = 0;
//		int cycle = 0;
//		while( i < len || cycle == 1) {
//			System.out.println(scoreStudent[i]);
//			i++;
//			if(i == 4) {
//				System.out.print(scoreStudent[i]);
//				System.out.println(" <-- RETURN POINT!");
//	
//					while(i > 0) {
//						System.out.println(scoreStudent[i-1]);
//						i--;
//						}
//					break;
//			}
//			
//		}
		
		
//		int size = 20;
		int [][] dbl = {{11,12,13,55,42},{12,12355,5555,123,23123},{222,3556,2325,1235,123},{123,43123123,5555,777,88989}}; 
	
		
//		System.out.println(dbl[0].length);	
		
		
		
//		
//		if(i == 0) {
//			System.out.println("Follwing Current List is extracted from "+(i+1)+"st list from 'dbl'");				
//		}else if(i==1) {
//			System.out.println("Follwing Current List is extracted from "+(i+1)+"nd list from 'dbl'");
//			
//		}else if(i==2) {
//			System.out.println("Follwing Current List is extracted from "+(i+1)+"rd list from 'dbl'");				
//		}else {
//			System.out.println("Follwing Current List is extracted from "+(i+1)+"th list from 'db'");				
//		}
//		
		
		
		
		
		
		int sum1 = 0;
		int sum2 = 0;
		int sum3 = 0;
		int sum4 = 0;
		int sum5 = 0;
		int avg1 = 0;
	
	
		
		for(int i = 0; i < dbl.length; i++) {
	
		
			for(int ii = 0; ii < dbl[i].length; ii++) {
				avg1 += dbl[i][ii];
				if(ii==0) {
					sum1 += dbl[i][0];					
				}else if(ii == 1) {
					sum2 += dbl[i][1];					
				}else if(ii == 2){
					sum3 += dbl[i][2];					
				}else if(ii ==3 ) {
					sum4 += dbl[i][3];					
				} else {
					sum5 += dbl[i][4];					
				}
			}
			System.out.println( i+1 +"번째 학생의 평균은 " + avg1/5 +" 입니다");
			
		}
		System.out.println("avg score of 1st sub is: " + (sum1/4));
		System.out.println("avg score of 2nd sub is: " + sum2/4);
		System.out.println("avg score of 3rd sub is: " + sum3/4);
		System.out.println("avg score of 4th sub is: " + sum4/4);
		System.out.println("avg score of 5th sub is: " + sum5/4);
		
		
		
		
		
		
		
		
		
//	for(int i = 5; i < 5)
//		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
