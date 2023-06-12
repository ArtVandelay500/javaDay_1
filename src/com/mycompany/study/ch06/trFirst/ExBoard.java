package com.mycompany.study.ch06.trFirst;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ExBoard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		
		Date myDate = new Date();
		Date myDay = myDate.getDate();	
		
//		String now_dt = format.format(myDate);			
		
		Board b = new Board("Bored to death","Hyunwook Hong",myDate);
		
		System.out.println(b.now_dt);
		
			
		
	}

}
