package com.mycompany.study.ch06.eighth;

public class Earth {

	static final int topBuilding = 828;
	static final String topBName = "Burj Khalifa";
	static final int topMountain = 8848;
	static final String topMName = "Mount Everest'";
	
	public static void name(String x) {
		if(x== "building") {
			System.out.println(topBName);
		}	
		else if(x == "mountain") {
			System.out.println(topMName);
		}else {
			System.out.println("Error occurred");
		}
			
	}
}
