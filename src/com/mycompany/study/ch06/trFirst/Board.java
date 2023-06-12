package com.mycompany.study.ch06.trFirst;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Board {
	SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
	String title;
	String writer;
	Date now = new Date();
	String now_dt = format.format(now);
	Board(String x, String y,Date z){
		this.title = x;
		this.writer = y;
		this.now = z;
	}


	void write() {
		System.out.println("You have written some paragraphs!");
	}
	void delete() {
		System.out.println("You have removed some paragraphs!");
	}
	
}