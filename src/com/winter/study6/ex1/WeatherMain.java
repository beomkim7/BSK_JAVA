package com.winter.study6.ex1;

import java.util.ArrayList;
import java.util.List;

public class WeatherMain {

	public static void main(String[] args) {
		try {
//			new WeatherController().start();
			WeatherDAO weatherDAO = new WeatherDAO();
			weatherDAO.getWeathers();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}