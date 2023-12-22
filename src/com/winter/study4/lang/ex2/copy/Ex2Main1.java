package com.winter.study4.lang.ex2.copy;

import java.time.LocalDate;
import java.util.Scanner;

public class Ex2Main1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("주민번호를 입력하세요");
		String myNum=sc.next();
		
		 char c = myNum.charAt(8);
		 if(c=='1'||c=='3') {
			 System.out.println("남자");
		 }else if(c=='2'||c=='4') {
			 System.out.println("여자");
		 }
		 
		String mygen = myNum.substring(0, 2);
		 System.out.println(mygen);
		 int realgen = Integer.parseInt(mygen);
		 if(23-realgen>=0) {
			 realgen=2000+realgen;
			 realgen=2023-realgen;
			 System.out.println(realgen);
		 }else {
			 realgen=1900+realgen;
			 realgen=2023-realgen;
			 System.out.println(realgen);
		 }
		 String mymon = myNum.substring(2, 4);
		 System.out.println(mymon);
		 
		 int birthmon = Integer.parseInt(mymon);
		 String mon = Ex2season1.getSeason(birthmon);
		 System.out.println(mon);
		 
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
