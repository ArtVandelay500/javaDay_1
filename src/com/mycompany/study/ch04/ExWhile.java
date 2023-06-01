package com.mycompany.study.ch04;

public class ExWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sum = 0;
		int y = 0;
		while(y < 11) {
			sum += y;
			y++;
		}
		System.out.println(sum);
		
		
		
		   int size = 20; // Define the size of the triangle

	        for (int i = 0; i < size; i++) {
	            for (int j = size - i; j > 1; j--) {
	                System.out.print(" ");
	            }
	            for (int k = 0; k <= i; k++) {
	                System.out.print(" *");
	            }
	            System.out.println();
	        }
		
	        
	        for(int i = 0; i < size; i++) {
	        	for (int j = size - i; j > 1; j--) {
	        		System.out.print(" *");
	        	}
	        	for(int k = 0; k <= i; k++) {
	        	}
	        	System.out.println();
	        }
		
		
	        for(int i = 0; i < 6; i++) {
	        	for(int ii = 0; ii < 11; ii++) {
	        		System.out.print("*");
	        	}
	        	System.out.println();
	        }
	        System.out.println();
	        System.out.println("------------------------------------------------");
	        System.out.println();
	        
	        for(int i = 0; i < 6; i++) {
	        	for(int ii = 0; ii < 11; ii++) {
	        		if(i == 0 || i == 5) {
	        			System.out.print("*");
	        		}else {
	        			if(ii == 0 || ii == 10) {
	        				System.out.print("*");
	        			}else {
	        				System.out.print(" ");
	        			}}
	        		
	        		}
	        	System.out.println();
	        }
		
	        System.out.println();
	        System.out.println("------------------------------------------------");
	        System.out.println();
	        
	        
	        String str = "";

	        for (int i = 1; i < 27; i++) {
	            if (i <= 12) {
	                str += i;
	                System.out.println(str);
	            } else {
	                int endIndex = str.length()-1;
	                str = str.substring(0,endIndex);
	                System.out.print(str);
	                System.out.println();
	            }
	        }

	
	        System.out.println();
	        System.out.println("------------------------------------------------");
	        System.out.println();
	        
	        int a = (int) (Math.random()*99)+1;
	        System.out.println(a);
	        
	        
	        
	        
	        
	        for (int i = 0; i < size; i++) {
	        	
	            for (int j = size - i; j > 1; j--) {
	                System.out.print(" ");
	            }
	            for (int k = 0; k <= i; k++) {
	                System.out.print(" *");
//	                System.out.print(k);
//	                System.out.print(i);
	            }
	            System.out.println();
	            
	            
	        }
	        

//	        System.out.println();
//	        System.out.println("------------------------------------------------");
//	        System.out.println();
	        
	        
	        
	        
	        
	        for (int i = 0; i < size; i++) {
	        	
	       
	            for (int k = 0; k <= i; k++) {
	                System.out.print(" ");
//	                System.out.print(k);
//	                System.out.print(i);
	            }
	            for (int j = size - i; j > 1; j--) {
	                System.out.print(" *");
	            }
	            System.out.println();
	            
	            
	        }
	        System.out.println();
	        System.out.println("------------------------------------------------");
	        System.out.println();
	        
	        
	        int size2 = 5;
	        for(int i = 0; i < size2; i++ ) {
	        	
	        	for(int j = size2+1; j > 1; j--) {
	        		System.out.print("* ");
	        		for(int k = 0; k < size2; k++) {
	        			System.out.print("");
	        		}
	        	}System.out.println();
	        }

		
	}

}
