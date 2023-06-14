package com.mycompany.study.ch08.second;

public class ImplementationC implements InterfaceA,InterfaceB,InterfaceC{

	@Override
	public void sayName() {
		// TODO Auto-generated method stub
		System.out.println("My name is Steve");
		
	}

	@Override
	public void sayBye() {
		// TODO Auto-generated method stub
		System.out.println("Goodbye!");
	}

	@Override
	public void sayHello() {
		// TODO Auto-generated method stub
		System.out.println("Hello!");
	}

}
