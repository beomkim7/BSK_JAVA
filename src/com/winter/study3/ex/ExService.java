package com.winter.study3.ex;

import java.util.Scanner;

public class ExService {
	Scanner sc = new Scanner(System.in);
	
	
	
	
	
	public Ex [] addEx(Ex [] exs) {
		Ex ex = new Ex();
		System.out.println("회사명");
		ex.setCompany(sc.next());
		System.out.println("이름");
		ex.setName(sc.next());
		System.out.println("직책");
		ex.setPosition(sc.next());
		System.out.println("전화번호");
		ex.setPhone(sc.nextInt());
		System.out.println("이메일");
		ex.setEmail(sc.next());
		System.out.println("주소");
		ex.setAddr(sc.next());
		
		if(exs == null) {
			Ex [] newEx = new Ex[1];
			newEx[0]=ex;
			return newEx;
		}else {
						
		Ex [] newEx = new Ex[exs.length+1];
		for(int i =0 ; i<exs.length;i++) {
			newEx[i]=exs[i];
		}newEx[exs.length]=ex;
		return newEx;
		}
	}
//	public Ex [] upex(Ex [] exs) {
//		Ex ex = new Ex();
//		
//		System.out.println("수정할 번호 입력");
//		int num = sc.nextInt();
//		for(int i = 0 ; i < exs.length;i++) {
//		if(num == exs[i].getNum()) {
//				
//			}			
//						
//		}
//	}
		
}
