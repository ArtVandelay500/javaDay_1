package com.mycompany.study.ch13.first;

public class ExGeneric {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Product<Tv, String> product1 = new Product<>();
		product1.setKind(new Tv());
		product1.setModel("스마트Tv");
		
		Tv tv = product1.getKind();
		String tvModel = product1.getModel();
		
		Product<Car, String> product2 = new Product<>();
		product2.setKind(new Car());
		product2.setModel("지바겐");
		
		Car car = product2.getKind();
		String carModel = product2.getModel();
		
		System.out.println(product2.getModel());
		System.out.println(carModel + " : " +  tvModel);
	
		
	}

}
