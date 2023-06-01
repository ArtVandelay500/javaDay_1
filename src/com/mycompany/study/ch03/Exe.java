package com.mycompany.study.ch03;

public class Exe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int grade = 71;
		int num = 100;
		
		if(grade >= 90) {
			if(grade <= 93) {
				System.out.println("Your Grade is A-" );
			}else if(grade <= 97) {
				System.out.println("Your Grade is A" );
			}else {
				System.out.println("Your Grade is A+" );
			}
		}else if( grade >= 80 &&  grade < 90 ) {
			if(grade <= 83) {
				System.out.println("Your Grade is B-" );
			}else if(grade <= 87) {
				System.out.println("Your Grade is B" );
			}else {
				System.out.println("Your Grade is B+" );
			}
		}else if(grade >= 70 &&  grade < 80 ) {
			if(grade <= 73) {
				System.out.println("Your Grade is C-" );
			}else if(grade <= 77) {
				System.out.println("Your Grade is C" );
			}else {
				System.out.println("Your Grade is C+" );
			}
		}else if(grade >= 60 &&  grade < 70 ) {
			if(grade <= 63) {
				System.out.println("Your Grade is D-" );
			}else if(grade <= 67) {
				System.out.println("Your Grade is D" );
			}else {
				System.out.println("Your Grade is D+" );
			}
		}else {
			System.out.println("Your Grade is F");
		}
		
		switch (grade) {
		case 100:
		case 99:
		case 98:
		case 97:
		case 96:
		case 95:
		case 94:
		case 93:
		case 92:			
		case 91:
		case 90:
			System.out.println("Your grade is more than or equals 90");
			break;
		case 80:
			System.out.println("grade is 80");
			break;
		case 79:
		case 78:
		case 77:
		case 76:
		case 75:
		case 74:
		case 73:
		case 72:			
		case 71:
		case 70:
			System.out.println("Your grade is more than or equals 70");
			break;
		case 60:
			System.out.println("grade is 60");
			break;
		default:
			System.out.println("I don't know how you got that score...");
		}
		
		
	
		
		String gradeStatus =  (grade >= 98 ) ? "You have scored A+!"
							: (grade >= 94 ) ? "You have scored A!"
							: (grade >= 90 ) ? "You have scored A-!"
							: (grade >= 88 ) ? "You have scored B+!"
							: (grade >= 84 ) ? "You have scored B!"
							: (grade >= 80 ) ? "You have scored B-!"
							: (grade >= 78 ) ? "You have scored C+!"
							: (grade >= 74 ) ? "You have scored C!"
							: (grade >= 70 ) ? "You have scored C-!"
							: "You have failed your life";
		
		
		
		System.out.println(gradeStatus);
		
		
		
	}

}
