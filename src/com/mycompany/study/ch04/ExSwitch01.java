package com.mycompany.study.ch04;

public class ExSwitch01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String mood = "";
		
		String action = (mood == "sad")? "gotta go and make some toast" :
						(mood == "happy") ? "you are fine!" :
							"nothing";
		
		System.out.println(action);
		
		String level = "";
		
		switch (level) {
		case "사장":
			System.out.println(level + "의 연봉은 100M");
			break;
		case "부장":
			System.out.println(level + "의 연봉은 90M");
			break;
		case "과장":
			System.out.println(level + "의 연봉은 50M");
			break;
		case "대리":
			System.out.println(level + "의 연봉은 40M");
			break;
		case "주임":
			System.out.println(level + "의 연봉은 5M");
			break;
		case "사원":
			System.out.println(level + "의 연봉은 3M");	
			break;
		case "나":
			System.out.println(level + "의 연봉은 1M");
			break;
		default:
			System.out.println("꿈이 없으시군요!");
			break;
		}
		
		
		
		
		
		
	}

}
