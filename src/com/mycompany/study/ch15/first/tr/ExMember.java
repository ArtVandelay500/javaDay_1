package com.mycompany.study.ch15.first.tr;

import java.util.ArrayList;
import java.util.List;

public class ExMember {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		List<Member> list = new ArrayList<Member>();
		
		Member member = new Member("홍현욱","gusdnrpig","1234","010-1111-1111","gusdnpig@yahoo.co.kr");
		Member member1 = new Member("김창중","nnn","5555","010-2222-1121","drangon@naver.com");
		Member member2 = new Member("상황곤","aaa","1111","010-2222-3333","bruce@daum.net");
		
		list.add(member);
		list.add(member1);
		list.add(member2);
		
		for(Member memberf: list) {
			System.out.println("이 멤버의 이름은: " + memberf.name);
			System.out.println("이 멤버의 아이디는: " + memberf.id);
			System.out.println("이 멤버의 비밀번호는: " + memberf.pwd);
			System.out.println("이 멤버의 전화번호는: " + memberf.tel);
			System.out.println("이 멤버의 이메일은: " + memberf.email);
			System.out.println("===================================");
		}
		
		
		
		
	}

}
