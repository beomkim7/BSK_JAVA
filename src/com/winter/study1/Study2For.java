package com.winter.study1;

import java.util.Scanner;

public class Study2For {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
	
		int id = 1234;
		int pw = 5678;
		boolean check = false; //false면 로그인 실패
		//아이디와 패스워드를 입력받기
		//로그인 성공 유무 판단
		String result="로그인 실패";
		for(int i=1 ; i<=5; i++) {
			
		System.out.println("ID입력");
		int yourId=sc.nextInt();
		System.out.println("PW입력");
		int yourPw=sc.nextInt();
		if(yourId == id && yourPw == pw) {
			//System.out.println("로그인 성공");
			//check =true ;
			result = "로그인 성공";
			check = !check;
			
			break;
		}
		
	}
		System.out.println(result);
//	if(check) {
//		System.out.println("로그인 성공");
//	}else {
//		System.out.println("로그인 실패");
//	}
}
}