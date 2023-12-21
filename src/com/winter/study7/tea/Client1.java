package com.winter.study7.tea;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client1 {
	
	
	public void send() throws Exception{
		
		
		Scanner sc = new Scanner(System.in);
		Socket socket = new Socket("localhost", 8282);
		System.out.println("서버와 접속이 성공");
		System.out.println("서버로 보낼 메세지 입력");
		
		//192.168.7.101
		
	
		String m = sc.next();

				
		OutputStream os = socket.getOutputStream();
		OutputStreamWriter ow = new OutputStreamWriter(os);
		BufferedWriter bw = new BufferedWriter(ow);		 
				 
			 bw.write(m+"\n\r");
			 bw.flush();	
			 
		 bw.close();
		 ow.close();
		 os.close();
		 sc.close();
		 socket.close();
	}

}
