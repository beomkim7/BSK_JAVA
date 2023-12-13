package com.winter.study3.rpg;

public class Character {
	private String name;
	private int hp;
	
	public Character() {
		
	}
	
	public void superInfo() {
		System.out.println(this.name);
		System.out.println(this.hp);
	}
	
	public void arrack() {
		System.out.println("마공");
	}
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
}
