package com.winter.study3.star;

public class StarMarine {
	public static void main(String[] args) {
		//변수 선언 	= 객체 생성
		//클래스명 변수명 = new 클래스명();
		Marine marine = new Marine();
		
		//멤버 사용
		//변수명.멤버변수명
		//변수명.멤버 메서드명();
		marine.hp=50;
		marine.move();
		
		Marine marine2 = new Marine();
		
		marine2 = marine;
		
		System.out.println(marine2.hp);
		
	}
}
