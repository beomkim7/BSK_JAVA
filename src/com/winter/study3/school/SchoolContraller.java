package com.winter.study3.school;

import java.util.Scanner;

public class SchoolContraller {

	public void start() {
		Scanner sc = new Scanner(System.in);
		SchoolService schoolservice = new SchoolService();
		Student[] students = null;
		SchoolView schoolview = new SchoolView();
		
		boolean check = true;
		
		while(check) {
			System.out.println("1. 학생정보입력");
			System.out.println("2. 학생정보출력");
			System.out.println("3. 학생정보검색");
			System.out.println("4. 학생정보추가");
			System.out.println("5. 프로그램종료");
			
			int select = sc.nextInt();
			switch(select) {
			case 1:
				students = schoolservice.makeStudents();
				break;
			case 2:
				schoolview.view(students);
				break;
			case 3:

				Student s = schoolservice.findByNum(students);
				if(s != null) {
					schoolview.view(s);
				}else {
					schoolview.view("학생이 없다");
				}

				break;
			case 4:
				
				break;
			default:
				break;
				
			}
		}
	}
}
