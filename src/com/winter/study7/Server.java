package com.winter.study7;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.Buffer;
import java.util.Scanner;

public class Server {
	public void s() throws Exception {

		ServerSocket ss = new ServerSocket(8282);
		System.out.println("클라이언트가 접속하기를 기다리는중");

		Socket socket = ss.accept();
		System.out.println("Client 연결 성공");
		
		
		
		InputStream is = null;
		InputStreamReader ir = null;
		BufferedReader br =null;
		
		OutputStream os = null;
		OutputStreamWriter ow = null;
		BufferedWriter bw = null;
		
		Scanner sc = new Scanner(System.in);
		
		boolean check = true;
		while(check) {			
			
			
			is = socket.getInputStream();//0,1
			ir = new InputStreamReader(is);
			br = new BufferedReader(ir);
			System.out.println(br.readLine());
			
			//클라이언트에게 메세지를 전송
			System.out.println("client에 보낼 메세지 입력");
			String m = sc.next();
			String n = "exit";
			
			if(m.equals(n)) {			
				check = false;			
			}
			
			os = socket.getOutputStream();
			ow = new OutputStreamWriter(os);
			bw = new BufferedWriter(ow);
			
			bw.write(m+"\n\r");
			bw.flush();
					
		}
		
		bw.close();
		ow.close();
		os.close();
		sc.close();
		
		br.close();
		ir.close();
		is.close();
		socket.close();
		
		System.out.println("서버 프로그램 종료");
	}
	
}
