package com.winter.study7.ex1.client;

import java.util.Scanner;

public class ClientMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClientController controller = new ClientController();
		
		//start()
		//참조변수명.멤버
		try {
			controller.start(null);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
