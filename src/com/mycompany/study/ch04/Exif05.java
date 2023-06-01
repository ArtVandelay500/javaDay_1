package com.mycompany.study.ch04;

public class Exif05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1 = 2;
		int num2 = -4;
		int num3 = 2;
		
	    int max = num1;
        int min = num1;

        if (num2 > max) {
            max = num2;
        }
        if (num3 > max) {
            max = num3;
        }

        if (num2 < min) {
            min = num2;
        }
        if (num3 < min) {
            min = num3;
        }
		
        System.out.println("Maximum number: " + max);
        System.out.println("Minimum number: " + min);

		
		
		
		
		
	}

}
