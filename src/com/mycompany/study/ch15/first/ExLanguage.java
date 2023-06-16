package com.mycompany.study.ch15.first;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ExLanguage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Language> lst = new ArrayList<Language>();
		Language langg = new Language("JAVA", 11); 
		
		lst.add(langg);
		lst.add(new Language("PYTHON",8));
		lst.add(new Language("C#",6));
		for(Language lang: lst) {
			System.out.println("language.name: " + lang.name);
			System.out.println("language.version: " + lang.version);
			System.out.println("=======================================");
		}
		
		
		
		
		
		
	}
	
	
		
	
	

}
