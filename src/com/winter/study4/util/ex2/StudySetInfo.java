package com.winter.study4.util.ex2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

public class StudySetInfo{
	
	
	
	public void ex1() {
		//ArrayList
		Random random = new Random();
		
		ArrayList<Integer> ar = new ArrayList<>();
		
			while(ar.size()<6) {			
			int num = random.nextInt(46);							
				boolean bool = ar.contains(num);				
				if(bool) {						
					continue;
				}ar.add(num);			
		}System.out.println(ar);
		
	}
	
	public void ex2() {
		//HashSet
		Random random = new Random();
		
		HashSet<Integer> hs = new HashSet<>();
		
		while(hs.size()<6) {
			int num = random.nextInt(46);
			hs.add(num);
		
		}
		System.out.println(hs);
		
	}
}