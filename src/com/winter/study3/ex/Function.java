package com.winter.study3.ex;

import java.util.Scanner;

public class Function {
	
	public void start() {
	Scanner sc = new Scanner(System.in);
	
	ExService exservice = new ExService();
	Ex [] exs = new Ex[0];
	ExView exview = new ExView();
	boolean check = true;

	
	while(check) {
		System.out.println("1.목록");
		System.out.println("2.디테일");
		System.out.println("3.추가");
		System.out.println("4.수정");
		System.out.println("5.삭제");
		
		int select = sc.nextInt();
		
		switch(select) {
			case 1:
				exview.view(exs);
				break;
			case 2:
				
				break;
			case 3:
				exs = exservice.addEx(exs);
				break;
			case 4:break;
			case 5:break;
			default:check=false;
		
			}
		}
	}
}
