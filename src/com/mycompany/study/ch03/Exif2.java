package com.mycompany.study.ch03;

public class Exif2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int grade = 3;
		int cost = 12000;
		String[] name=new String[6];
		name[0] = "";
		name[1] = "일반";
		name[2] = "브론즈";
		name[3] = "실버";
		name[4] = "골드";
		name[5] = "플래티넘";
		
		String[] level = {"일반","브론즈","실버","골드","플래티넘"};
				
	

		if(grade == 0) {
			System.out.println("정가가 " + cost +"원인 " + level[grade] +" 등급의 할인가는 " + (int) (cost * .95 )+ "원입니다");
		}else if(grade == 1) {
			System.out.println("정가가 " + cost +"원인 " + level[grade] +" 등급의 할인가는 " + (int) (cost * .9 )+ "원입니다");			
		}else if(grade == 2){
			System.out.println("정가가 " + cost +"원인 " + level[grade] +" 등급의 할인가는 " + (int) (cost * .85 )+ "원입니다");						
		}else if(grade == 3) {
			System.out.println("정가가 " + cost +"원인 " + level[grade] +" 등급의 할인가는 " + (int) (cost * .8 )+ "원입니다");									
		}else {
			System.out.println("정가가 " + cost +"원인 " + level[4] +" 등급의 할인가는 " + (int) (cost * .973 )+ "원입니다");									
			
		}
		
		
		
		
		
		
		
	}

}
