package com.winter.study3.ex;

public class ExView {
	
	public void view(Ex ex) {
		System.out.println(ex.getCompany());
		System.out.println(ex.getName());
	}
	public void view(Ex [] exs) {
		for(int i =0 ; i<exs.length ; i++) {
			this.view(exs[i]);
		}
	}
	
}
