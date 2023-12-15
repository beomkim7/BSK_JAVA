package com.winter.study4.lang.ex2;

import java.time.LocalDate;
import java.util.Scanner;

public class Ex2Main {

	public static void main(String[] args) {
		java.util.Scanner sc = new Scanner(System.in);
		System.out.println("주민번호 입력");
		String myNum = sc.next();
		System.out.println(myNum);
		
		char myGender =myNum.charAt(8);
//		System.out.println(myGender);
		if(myGender == '1' ||myGender == '3') {
			System.out.println("남자");
		}else if(myGender == '2' || myGender == '4'){
			System.out.println("여자");
		}
		String myGender1 =myNum.substring(0,2);
//		System.out.println(19+myGender1);
		String myGender2 = 19+myGender1;
		String myGender3 = 20+myGender1;
		int s = Integer.parseInt(myGender1);
		int realyear=Integer.parseInt(myGender2); 
//		System.out.println(realyear);
		int realyear2=Integer.parseInt(myGender3);
		
//		System.out.println(myResult);
		LocalDate now = LocalDate.now();
		
		int year =now.getYear();
//		System.out.println(year);
		
		if(s>23) {
			
			int realage=year-realyear;
			System.out.println(realage);
		}else {
			int realage=year-realyear2;
			System.out.println(realage);
		}
		
		int birthMon =Integer.parseInt(myNum.substring(3,4));
		String season = Ex2season.getSeason(birthMon);
		System.out.println(season);
		
		String s12 = new String();
		Object obj = new Object();
		
		
		
		for(int i =0 ; i<myNum.length() ; i++) {
			char a = myNum.charAt(i);
			
			int n = Integer.parseInt(String.valueOf(a));
			
			
		}
		//1. 남자여자 구별
		
		//2. 대략 나이?
		
		//3. 태어난 계절?
		
		//4. 주민번호 타당성 검사
		//	9	9	1	2	2	5	-	1	2	3	4	5	6	7
		//	2	3	4	5	6	7		8	9	2	3	4	5
		//	총합구하기
		//	ex) 122(총합)을 11로 나눈 나머지를 구함
		// 11에서 나머지를 뺌 결과를 체크용 번호와 비교
		// 결과 2자리라면 
		//	그 나머지를 10으로 나눈 나머지를 
		//	그 나머지를 체크번호와 일치 확인
		
		
		
		//이름 , 주민
		

	}

}
