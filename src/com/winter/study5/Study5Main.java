package com.winter.study5;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Study5Main{
	
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("숫자 입력");
			try {
				int num = sc.nextInt();
				//throw new InputMismatchException();
			
			System.out.println("정상 진행");
			String str = null;
			
//			Error
//			int a ;			
//			System.out.println(a);
			
			Test t = new Test();
			
			int [] arr = new int[2];
			
			arr[3]=10;
			//new ArrayIndexOutOfBoundsException();
			}catch(InputMismatchException e) {
				// TODO: handle exception
			}catch (ArrayIndexOutOfBoundsException e) {
				// TODO: handle exception
			}catch(RuntimeException e) {
				System.out.println("Exception 발생");
			}catch (Throwable e) {
				
				// TODO: handle exception
			}
			
			int a = 10 ;
			a=a/0;
			new ArithmeticException();
			
			ArrayList<Integer> ar = null;
			t.t1(ar);
			
			System.out.println("종료 합니다.");
		}
	}
	