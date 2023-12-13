package com.winter.study3.himart;

public class Tv extends Product{
	private String color;

	public Tv() {
		this.color="black";
		this.setSize(100);
		this.setBrand("Samsung");
		this.setPoint(25);
		this.setCost(2500);
	}
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
}
