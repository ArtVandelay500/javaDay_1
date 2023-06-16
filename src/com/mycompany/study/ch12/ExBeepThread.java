package com.mycompany.study.ch12;

import java.awt.Toolkit;

public class ExBeepThread {

	public static void main(String[] args) {
		//how1
//		Runnable runnable = new ExBeepRunable();
//		Thread thread = new Thread(runnable);
		
		//how2
		Thread thread = new Thread(new Runnable() {
			@Override
			public void run() {
				Toolkit toolkit = Toolkit.getDefaultToolkit();	
				for(int i=0; i<5; i++) {		
					toolkit.beep();
					try { Thread.sleep(500); } catch(Exception e) {}
				}
				
			}
		});
		
		
		thread.start();
		
		for(int i=0; i<5; i++) {
			System.out.println("12");
			try { Thread.sleep(500); } catch(Exception e) {}
		}

	}

}
