package com.winter.study4.lang.ex2;

public class Ex2season {
	public static String getSeason(int birthMon){
		String real="";
		if(birthMon == 12 || birthMon == 1 || birthMon ==2) {
			real = "겨울";

		}else if(birthMon>2 && birthMon <6) {
			real = "봄";

		}else if(birthMon>5 && birthMon <9) {
			real = "여름";

		}else if(birthMon>8 && birthMon <12) {
			real = "가을";

		}
		
		return real;
	}
}
