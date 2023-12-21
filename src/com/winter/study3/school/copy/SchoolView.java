package com.winter.study3.school.copy;

import java.util.Scanner;


public class SchoolView {
	
	//view
	public void view(String message) {
		System.out.println(message);
	}
	public void view(Student student) {
		
			System.out.println("이름"+student.name);
			System.out.println("번호"+student.num);
			System.out.println("점수"+student.jumsu);						
			
	}

	public void view(Student [] students) {
		for(int i = 0 ; i <students.length;i++) {
			this.view(students[i]);
//		System.out.println("이름"+students[i].name);
//		System.out.println("번호"+students[i].num);
//		System.out.println("점수"+students[i].jumsu);						
		}
	}

	
}
