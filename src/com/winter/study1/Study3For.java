package com.winter.study1;

import java.util.Scanner;

public class Study3For {
	public static void main(String[] args) {
		
//		//구구단
//		for(int i = 2 ; i < 10 ; i++) {
//			for(int j = 1 ; j < 10 ; j++) {
//				System.out.println(i+"*"+j+"="+i*j);	
//			}
//		}
		Scanner sc = new Scanner(System.in);
		//0-59분
		//0-59초
		//1분 5초
		//분과 초를 입력

		int min = 1;
		int scd = 5;
		
		boolean flag = false;
		for(int m= 0 ; m < 60 ; m++) {
			for(int s = 0 ; s<60 ; s++) {
				System.out.println(m+"분"+s+"초");
				if(min == m && scd == s) {
					m=59;
					flag = !flag;
					break;
				}
			}
		}
//		//반복문을 종료 하는 방법
//		//1. break를 만났을 때
//		//2. 조건식이 false일 때
//		min = sc.nextInt();
//		scd = sc.nextInt();
//		for(int i = 0 ; i < 60 ; i++) {
//			
//			
//			for(int j = 0 ; j < 60 ; j++) {
//				System.out.println(i+"분"+j+"초");
//				if(min == i && scd == j) {
//					
//					return;
//				}
//			}
//			
//		}
	
	
	
	}
}
