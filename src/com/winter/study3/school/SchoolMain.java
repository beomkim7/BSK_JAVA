package com.winter.study3.school;

public class SchoolMain {
	public static void main(String[] args) {
		//객체 생성
		//클래스명 변수명 = new 클래스명();
		Student stu = new Student();
		stu.name="winter";
		stu.num=1;
		stu.jumsu=3.12;
		
		Student stu2 = new Student();
		stu2.name="winter";
		stu2.num=1;
		stu2.jumsu=3.12;
		
		Student stu3 = new Student();
		
		System.out.println(stu3.name);
		System.out.println(stu3.num);
		
		Student [] students = new Student[2];
		students[0]=stu;
		students[1]=new Student();
		System.out.println(students[0].jumsu);
	
		
		
	}
}
