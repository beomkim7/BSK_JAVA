package com.winter.study7.tea;

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

public class Server1 {
	public void s() throws Exception {
		
		Scanner sc = new Scanner(System.in);
		
		ServerSocket ss = new ServerSocket(8282);
		System.out.println("클라이언트가 접속하기를 기다리는중");

		Socket socket = ss.accept();
		System.out.println("Client 연결 성공");
			
			
		InputStream is = socket.getInputStream();//0,1
		InputStreamReader ir = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(ir);
		System.out.println(br.readLine());
			
			//클라이언트에게 메세지를 전송
					
		is.close();
		ir.close();
		br.close();
		sc.close();
		
	
		
		System.out.println("서버 프로그램 종료");
	}
	
}
