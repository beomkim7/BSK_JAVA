package com.winter.study7;

public class ClientMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Client client = new Client();
		try {
			client.send();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
