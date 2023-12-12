package com.winter.study3.members;

public class MemberMain {
	public static void main(String []args) {
		Member member = new Member();
//		member.name="winter";
//		member.muge=65.3;
//		member.age=200;
		
		member.setName("winter");
		System.out.println(member.getName());
		
		member.setMuge(12);
		System.out.println(member.getMuge());
	}
}
