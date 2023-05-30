package com.mycompany.study.ch03;

public class ExConditionalOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int num = 10;
		String mood = "bad";
		String face = "Smile";
		
		String status = (mood == "bad") ? "Gotta go and relax" 
						: (mood == "happy") ? "Party People~~"
						: (mood == "meh") ? "call it a day" 
					
			
			;
		
		System.out.println(status + ", and you need to " +face);
		
		
	
	}

}
