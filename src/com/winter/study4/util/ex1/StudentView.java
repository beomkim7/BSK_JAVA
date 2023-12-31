package com.winter.study4.util.ex1;

import java.util.ArrayList;

public class StudentView {
	
	//메시지를 출력
	public void view(String message) {
		System.out.println(message);
	}
	
	//학생 한명의 모든 정보를 출력
	public void view(StudentDTO studentDTO) {
		System.out.println();
	}
	
	
	//학생들의 모든 정보를 출력
	public void view(ArrayList<StudentDTO> ar) {
		//향상된 for문
		//for(모은데이터타입명 변수명:collection변수명){}
		for(StudentDTO studentDTO:ar) {
			System.out.println(studentDTO.getName());
			System.out.println(studentDTO.getAvg());
			System.out.println("=====================");
		}
		
		
//		for(int i=0;i<ar.size();i++) {
//			System.out.println(ar.get(i));
//		}
	}

}