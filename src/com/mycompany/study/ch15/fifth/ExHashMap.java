package com.mycompany.study.ch15.fifth;

import java.util.HashMap;
import java.util.Map;

public class ExHashMap {

	public static void main(String[] args) {

		Map<String, Integer> map = new HashMap<>();
		
		HashMap<String, Integer> hashMap = new HashMap<String, Integer>();

		
		map.put("키",295);
		map.put("나이",95);
		map.put("몸무게",195);
		map.put("생년월일",1955);
		map.put("random",1955);
		
	
		map.forEach((strKey, strValue)->{
			System.out.println( strKey +":"+ strValue );
		});
		System.out.println("=================================================");
		System.out.println("^^^^FOREACH METHOD^^^^");
		System.out.println("=================================================");
		
		
		for( Map.Entry<String, Integer> entry : map.entrySet() ){
			String strKey = entry.getKey();
			Integer strValue = entry.getValue();
		    System.out.println( strKey +":"+ strValue );
		}
		System.out.println("=================================================");
		System.out.println("^^^^ENTRY METHOD^^^^");
		System.out.println("=================================================");
		
		
		map.put("NumClear" , 1);
		
//		System.out.println(map.get("나이"));
		
		for(String str : map.keySet()) {
			Integer val = map.get(str);
			System.out.println(str + " : " + val);
		}
	

	
	

	
	Map<String,String> returnMap = new HashMap<>();
	String rtMember = null;
	
	if(rtMember != null) {
		returnMap.put("rt","success");
			
		
	}else {
		returnMap.put("rt","fail");
	}
	
	
	System.out.println(returnMap.get("rt"));
	
	
	
	
	
	
	
	}
	
	
}
