package com.winter.study2;

import java.util.Scanner;

public class ArrayStudy4 {
	public static void main(String[] args) {
		//1. 학생정보생성
		//	- 학생수를 입력받음
		//	- 학생수 만큼 이름,번호,학점
		//2. 학생정보출력
		//3. 학생정보검색
		//	- 검색할 학생번호를 입력받아서 해당학생의 정보를 출력
		//4. 성적순출력
		//5. 프로그램종료
		
		
		Scanner sc = new Scanner(System.in);
		boolean check=true;
		String [] names = null;
		int [] nums= null;
		double [] scores=null;
		
		
		while(check) {
			System.out.println("1. 학생정보생성");
			System.out.println("2. 학생정보출력");
			System.out.println("3. 학생정보검색");
			System.out.println("4. 성적순출력");
			System.out.println("5. 프로그램종료");
			int select = sc.nextInt();
			
			if(select==1) {
				System.out.println("학생수를 입력");
				select = sc.nextInt();
				names = new String [select];
				nums = new int [select];
				scores = new double [select];
				
				for(int i = 0 ; i <names.length ; i++) {
					System.out.println(i+1+"번째 학생 이름 입력");
					names[i]=sc.next();	
					System.out.println(i+1+"번째 학생 번호 입력");
					nums[i]=sc.nextInt();	
					System.out.println(i+1+"번째 학생 학점 입력");
					scores[i]=sc.nextDouble();	
				}				
			}else if(select==2) {
				System.out.println("정보출력");
				for(int i= 0 ; i<names.length;i++) {
					System.out.println(names[i]+nums[i]+","+scores[i]);							
				}
			}else if(select==3) {
				System.out.println("검색");
					
					int	i=sc.nextInt();
					System.out.println(names[i-1]+nums[i-1]+","+scores[i-1]);
				}
				
				
			else if(select==4) {
				System.out.println("성적순");
				for(int i =0 ; i<names.length ; i++) {
					int limit = i;
					for(int j = i ; j<names.length-1 ; j++) {
						if(scores[limit]<scores[j+1]) {
							limit=j+1;
							
						}						
					}
					Double temp=scores[limit];
					scores[limit]=scores[i];
					scores[i]=temp;
				}
				for(int i = 0 ; i<names.length ; i++) {
					System.out.println(names[i]+nums[i]+","+scores[i]);
				}
			}else {
				System.out.println("종료");
				break;
			}
				
			
			
		}
		
	}
}
