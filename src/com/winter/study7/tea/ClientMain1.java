package com.winter.study7.tea;

public class ClientMain1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Client1 client = new Client1();
		try {
			client.send();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
