package com.winter.study1;

import java.util.Scanner;

public class Study4For {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		boolean check = true;
		
		int id = 1234;
		int pw = 2345;
		while(check) {
			System.out.println("1.로그인 2.나가기");
			int get = sc.nextInt();
			
			
			if(get == 1) {
				System.out.println("id pw입력");
				int rid = sc.nextInt() ;
				int rpw = sc.nextInt() ;
				if(rid == id && rpw == pw) {
					System.out.println("로그인 되었습니다");
					break;
				}else {
					System.out.println("id pw 확인");
				}
			}else {
				check=false;
			}
		}
		
	}

}