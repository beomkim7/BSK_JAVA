package com.winter.study3.himart;

class HimartMain {
	public static void main(String[] args) {
		Notebook notebook = new Notebook();
		Phone phone=new Phone();
		Tv tv = new Tv();
		
		Customer customer = new Customer();
		customer.buy(phone);
		
		Product [] Products = new Product [3];
		Products[0]=tv;
		Products[1]=phone;
		Products[2]=notebook;
	}
}
