package com.winter.study3.himart;

public class Phone extends Product {
	private int pixel;
	private String model;
	
	public Phone() {
		this.pixel=100;
		this.model="a1";
		this.setBrand("apple");
		this.setCost(40);
		this.setPoint(2);
	}
	
	public int getPixel() {
		return pixel;
	}
	public void setPixel(int pixel) {
		this.pixel = pixel;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
}
