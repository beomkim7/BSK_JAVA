package com.winter.study1;

import java.util.Scanner;

public class Study1For {
	public static void main(String [] args) {
		System.out.println("프로그램 시작");
		Scanner sc = new Scanner(System.in);
		System.out.println("정수하나를 입력하세요");
		
		int num = sc.nextInt();
		
		int a =1;
		//입력받은 정수의 약수를 출력하세요
		//약수의 갯수를 출력하세요
		//for(입력식;조건식;증감식){}
		for(int i = 1 ; i <= num/2;i++)
		{
			if(num%i == 0) {
				System.out.println(i);
				
				a++;
				
			}
			
				
			
		}
		System.out.println(num);
		System.out.println(a);
				
	}
}
