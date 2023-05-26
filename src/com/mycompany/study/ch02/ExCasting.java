package com.mycompany.study.ch02;

/**
 * @author i7C-31
 *
 */
/**
 * @author i7C-31
 *
 */
public class ExCasting {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double doubleVar = 123456789;
		System.out.println(doubleVar);
		
		System.out.println();
		
		float floatVar = (float) doubleVar;
		System.out.println(floatVar);
		
		long longVar = (long)floatVar;
		System.out.println(longVar);
		
		int intVar = (int)longVar;
		System.out.println(intVar);
		
		short shortVar = (short)intVar;
		System.out.println(shortVar);
		
		byte byteVar = (byte)shortVar;
		System.out.println(byteVar);
		
//		double > float > long > int > short > byte
		
		
		

		
			
	}
	
}