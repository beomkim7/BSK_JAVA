package com.winter.study3.study;

public class Test {
	
	public void t1() {
		int num = 10 ;
		System.out.println("T1 Method");
		if(num%2==0) {
			return;
		}
		
	}
	
	public int t2(int num1, int num2) {
		int sum = num1 + num2;
		num1 = 30;
		
		return sum;
	}
	
	
	public int t3(Human human) {
		if(human.age>19) {
			System.out.println("성년");
		}else {
			System.out.println("미성년");
		}
		human = new Human();
		human.age = 500;
		
		return human.age;
	}
	
	
	public void t4(int [] ar) {
		for (int i = 0 ; i<ar.length;i++) {
			System.out.println(ar[i]);
									
		}
		ar= new int[2];
	}
	
	
	
}
