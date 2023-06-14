package com.mycompany.study.ch02;

public class Computer extends Calculator{


	@Override
	public double param(int r) {
		// TODO Auto-generated method stub
		double result = (r * r) * Constants.PAI_2;
		
		return result;
	}
	
}

