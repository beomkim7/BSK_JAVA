package com.winter.study3.school.copy;

import java.util.Scanner;

public class SchoolContraller {

	public void start() {
		Scanner sc = new Scanner(System.in);
		SchoolService schoolservice = new SchoolService();
		Student [] students = new Student[0];
		SchoolView schoolview = new SchoolView();
		
		boolean check = true;
		
		while(check) {
			System.out.println("1. 학생정보입력");
			System.out.println("2. 학생정보출력");
			System.out.println("3. 학생정보검색");
			System.out.println("4. 학생정보추가");
			System.out.println("5. 프로그램종료");
			
			
			int select = sc.nextInt() ;
			
			if(select == 1) {
				students = schoolservice.makeStudents();
				
			}else if(select == 2) {
				schoolview.view(students);
				
			}else if(select == 3) {
				Student s = schoolservice.findByNum(students);
				if(s != null) {
					schoolview.view(s);
				}else {
					schoolview.view("찾을수 없다");
				}
			}else if(select == 4) {
				students = schoolservice.addStudent(students);
				
			}else{
				check = false;
			}
			
		}

	}
}
