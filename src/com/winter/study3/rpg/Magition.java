package com.winter.study3.rpg;

public class Magition {
	
	
	String name;
	int hp;
	int mp;
	
	public void info() {
		//String localName = "abc";
		//멤버메서드내에서 멤버변수를 접근해서 사용가능
		//name="iu";
		System.out.println(this);
		System.out.println("Name : "+this.name);
		System.out.println("Hp : "+this.hp);
		this.t1();
		t1();
	}
	
	public void t1() {
		System.out.println("Test 매서드 입니다");
		this.info();
	}
	
}
