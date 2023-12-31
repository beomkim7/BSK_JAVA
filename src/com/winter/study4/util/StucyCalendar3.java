package com.winter.study4.util;

import java.sql.Date;
import java.util.Calendar;
import java.util.UUID;

public class StucyCalendar3 {
	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		calendar.set(2023, 11, 31);
		System.out.println(calendar.getTime());
		int d = calendar.get(Calendar.DATE);
		d=d+3;
		calendar.set(Calendar.DATE, d);
		System.out.println(d);

		System.out.println(calendar.getTime());
		
		calendar.set(2023, 11, 31);
		
		//calendar.roll(calendar.DATE,3);
		calendar.add(Calendar.DATE,3);
		
		System.out.println(calendar.getTime());
		
		//UUId
		String n = UUID.randomUUID().toString();
		System.out.println(n);
		
	}
}
