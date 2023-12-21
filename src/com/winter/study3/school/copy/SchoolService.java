package com.winter.study3.school.copy;

import java.util.Scanner;

public class SchoolService {
	Scanner sc = new Scanner(System.in);
	//addStudent
	//이름,번호,점수를 입력받아서 기존 배열에 추가한 효과
	public Student [] addStudent(Student [] students) {
		Student student = new Student();
		System.out.println("이름 입력");
		student.name=sc.next();
		System.out.println("번호 입력");
		student.num=sc.nextInt();
		System.out.println("점수 입력");
		student.jumsu=sc.nextDouble();
		Student [] newstudents = new Student[students.length+1];
		
		for(int i = 0 ; i <students.length;i++) {
			newstudents[i]=students[i];
		}
		newstudents[students.length]=student;
		return newstudents;
	}
	
//		Scanner sc = new Scanner(System.in);
	

//		newStudents[newStudents.length-1]=student;
	
	public Student findByNum(Student [] students) {		
		System.out.println("검색할 학생 번호 입력");
		int select=sc.nextInt();
		Student student = null;
		for(int i = 0 ; i < students.length ; i++ ) {
			if(select == students[i].num) {
				student = students[i];
				break;
			}
		}return student;
	}

	
	//findByNum
	//학생번호를 입력받아서, 일치하는 학생이 있는지 검색
	//해당학생을 리턴 없으면 null리턴
	
		
//		Scanner sc = new Scanner(System.in);
	
	public Student[] makeStudents() {
		
		System.out.println("학생 수");
		int count = sc.nextInt();
		Student [] students = new Student[count];

		
		for(int i = 0 ; i < count ;i++) {
			Student student = new Student();
			System.out.println("학생이름");
			student.name=sc.next();
			System.out.println("학생번호");
			student.num=sc.nextInt();
			System.out.println("학생점수");
			student.jumsu=sc.nextDouble();
			students[i]=student;
		}
		return students;
	}
	//매서드 makeStudents
	//학생수를 입력받아서 수만큼 학생정보를 입력
	
//		Scanner sc = new Scanner(System.in);
		
	
	
}
