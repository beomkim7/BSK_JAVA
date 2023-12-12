package com.winter.study3.cars;

public class Car {
	
	String company;
	String name;


	String color;
	int price;
	Engine engine;
	
	public Car() {
		this(new Engine());
		
	}
	
	public Car(Engine engine) {
		this.company ="kia";
		this.name = "K2";
		this.color = "Red";
		this.price = 3000;
		this.engine=engine;
	}
	
	
//	//기본생성자 디폴트생성자 빈생성자
//	public Car() {
//		this("black");
//	}
//	
//	public Car(String c) {
//		this("k5",c);
//	}
//	
//	public Car(String name, String c) {
//		this.company ="kia";
//		this.name = name;
//		this.fuel = "gas";
//		this.color = c;
//		this.price = 3000;
//		this.cc=2000;
//	}
//	
//	
//	public void info() {
//		System.out.println("Company : " + this.company);
//		System.out.println("Name : "+this.name);
//		System.out.println("Fuel : "+this.fuel);
//		System.out.println("Coler : "+ this.color);
//		System.out.println("Price : "+this.price);
//		System.out.println("Cc : "+this.cc);
//	}
}

	
