package com.winter.study6.copy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class StudyIO {
	
	//
	public void input() {
		
		InputStream is = System.in;
		
		 InputStreamReader ir = new InputStreamReader(is);
		 
		 BufferedReader br = new BufferedReader(ir);
		 
		 try {
			String str = br.readLine();
			System.out.println(str);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		 
	}
	

}