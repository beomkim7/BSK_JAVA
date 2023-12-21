package com.winter.study7;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client {
	
	
	public void send() throws Exception{
		
		
		Scanner sc = new Scanner(System.in);
		Socket socket = new Socket("localhost", 8282);
		System.out.println("서버와 접속이 성공");
		String n = "exit";
		//192.168.7.101
		InputStream is = null;
		InputStreamReader ir = null;
		BufferedReader br =null;
		
		OutputStream os = null;
		OutputStreamWriter ow = null;
		BufferedWriter bw = null;
		os = socket.getOutputStream();//0,1
		ow = new OutputStreamWriter(os);
		bw = new BufferedWriter(ow);		 
		
		is = socket.getInputStream();
		ir = new InputStreamReader(is);
		br = new BufferedReader(ir);
		
		boolean check = true;
		while(check) {
			System.out.println("서버로 보낼 메세지 입력");
			String m = sc.nextLine();

			if(m.equals(n)) {			 
				 check = false;				 
			}
							 
			 bw.write(m+"\n\r");
			 bw.flush();	
			 
			System.out.println(br.readLine());

		}
		
		 bw.close();
		 ow.close();
		 os.close();
		 sc.close();
		 
		 br.close();
		 ir.close();
		 is.close();
		 socket.close();
	}

}
