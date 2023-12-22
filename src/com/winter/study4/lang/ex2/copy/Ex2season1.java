package com.winter.study4.lang.ex2.copy;

public class Ex2season1 {
	public static String getSeason(int birthmon) {
		String s = "";
		
		if(birthmon == 1 || birthmon==2 || birthmon == 12) {
			s="겨울";
			
		}else if(birthmon>2 && birthmon <6) {
			s="봄";
		}else if(birthmon>5 && birthmon<9) {
			s="여름";
		}else if(birthmon>8 && birthmon<12) {
			s="가을";
		}
		return s;
	}
}
