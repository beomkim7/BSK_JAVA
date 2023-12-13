package com.winter.study3.himart;

public class Notebook extends Product {
	private String cpu;

	
	public Notebook() {
		this.cpu=("i7");
		this.setPoint(1);
		this.setCost(100);
	}
	
	public String getCpu() {
		return cpu;
	}

	public void setCpu(String cpu) {
		this.cpu = cpu;
	}
		
	
}
