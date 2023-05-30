package com.mycompany.study.ch03;

/**
 * @author i7C-31
 *
 */
public class ExIncreaseDecrease {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int a = 0;
		int b = 0;
		
		int i = 0;
		int j = 0;
		
		a--;
		--b;
		System.out.println("a : " + a);
		System.out.println("b : " + b);
		
		int k = i++;
		int m = ++j;
		
		System.out.println("k: " + k);
		System.out.println("i: " + i);
		System.out.println("m: " + m);
		System.out.println("j: " + j);
		
		
		--i;
		int z = ++i + j++;
		System.out.println("z: " + z);
		System.out.println("i: " + i);
		System.out.println("j: " + j);
		
	}

}
