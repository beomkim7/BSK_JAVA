package com.winter.study7.ex1.client;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.nio.file.WatchKey;
import java.nio.file.WatchService;
import java.nio.file.Watchable;
import java.nio.file.WatchEvent.Kind;
import java.nio.file.WatchEvent.Modifier;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.concurrent.ArrayBlockingQueue;

import com.winter.study6.ex1.WeatherDAO;
import com.winter.study6.ex1.WeatherDTO;

public class ClientController {
	private Scanner sc;
	private ClientView cv; 
		
	
	
	public ClientController() {
		this.sc = new Scanner(System.in);
	}
		
	public ClientController(Scanner sc) {
		this.sc = sc;
	}
	
	public void setSc(Scanner sc) {
		this.sc = sc;
	}
	
	public void start(Scanner sc) throws Exception {
		Scanner scanner = new Scanner(System.in);
		//1. 서버와 소켓 연결시도
		Socket socket = new Socket("localhost",8282);
		//보낼 준비
		OutputStream os = socket.getOutputStream();
		OutputStreamWriter ow = new OutputStreamWriter(os);
		BufferedWriter bw = new BufferedWriter(ow);
		//받을 준비		
		InputStream is = socket.getInputStream();
		InputStreamReader ir = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(ir);
		
		//1.날씨정보출력
		//2.날씨정보검색
		//3.프로그램종료
				//DTO 데이터 트랜스퍼 오브잭트
		
		boolean check = true ;
		while(check) {
			System.out.println("1. 날씨정보출력");
			System.out.println("2. 날씨정보검색");
			System.out.println("5. 프로그램종료");
			int select = scanner.nextInt();
			List<WeatherDTO> ar = new ArrayList<>();
			
			if(select == 1) {
				System.out.println("출력");
				bw.write(select + "\n\r");
				bw.flush();
				
				String data = br.readLine();//p-1-p-0-p-1-p-0
				
				StringTokenizer st = new StringTokenizer(data,"-");
				
				while(st.hasMoreTokens()) {
					WeatherDTO weatherDTO = new WeatherDTO();
					weatherDTO.setCity (st.nextToken());//도시
					weatherDTO.setGion (Integer.parseInt(st.nextToken()));//기온
					weatherDTO.setCity(st.nextToken());//날씨
					weatherDTO.setHum(Integer.parseInt(st.nextToken()));//습도
					ar.add(weatherDTO);
				}
				
			}else{
				System.out.println("종료");
				break;
			}
		}
	}
}
