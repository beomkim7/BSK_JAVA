package com.winter.study7.ex1.client;

import java.util.Scanner;

public class ClientController {
	private Scanner sc;
	
	public ClientController() {
		this.sc = new Scanner(System.in);
	}
		
	public ClientController(Scanner sc) {
		this.sc = sc;
	}
	
	public void setSc(Scanner sc) {
		this.sc = sc;
	}
	
	public void start(Scanner sc) {
		Scanner scanner = new Scanner(System.in);
		//1. 서버와 소켓 연결시도
		
		//1.날씨정보출력
		//2.날씨정보검색
		//3.프로그램종료
		
		
		
		boolean check = true ;
		while(check) {
			System.out.println("1. 날씨정보출력");
			System.out.println("2. 날씨정보검색");
			System.out.println("3. 프로그램종료");
			int select = scanner.nextInt();
			
			if(select == 1) {
				System.out.println("출력");
			}else{
				System.out.println("종료");
				break;
			}
		}
	}
}
