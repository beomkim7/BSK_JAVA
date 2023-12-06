package com.winter.study2;

public class ArrayStusy2 {
	public static void main(String[] args) {
		//배열선언
		int [] ar = {2,4,5};
		
		ar = new int[] {2,4};
		
		int [] ar2 = ar;
		
		
		for(int i = 0 ; i <ar.length;i++) {
			System.out.println(ar2[i]);
		}
		
		
	}
}
