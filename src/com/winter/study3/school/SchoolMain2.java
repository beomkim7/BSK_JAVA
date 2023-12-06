package com.winter.study3.school;

import java.util.Scanner;

public class SchoolMain2 {
	public static void main(String[] args) {
		//객체 생성
		//클래스명 변수명 = new 클래스명();
		//학생의 수를 입력받아서
		//학생의 정보를 입력 받기
		Scanner sc = new Scanner(System.in);
		System.out.println("학생의 수를 입력하세요");
		int select = sc.nextInt();
		Student [] students = new Student[select];
		for(int i = 0 ; i < select ; i++ ) {
			
			
			students[i]=new Student();
			System.out.println("학생의 이름을 입력하세요");
			students[i].name=sc.next();
			System.out.println("학생의 번호를 입력하세요");
			students[i].num=sc.nextInt();
			System.out.println("학생의 점수를 입력하세요");
			students[i].jumsu=sc.nextDouble();			
		}
		
		
		for(int i = 0 ; i < select ; i++ ) {
			
			System.out.println(students[i].name+students[i].num+students[i].jumsu);
		}
		
		System.out.println("종료");
	}
}
