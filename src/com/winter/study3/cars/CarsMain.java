package com.winter.study3.cars;

import java.util.Scanner;

public class CarsMain {
	public static void main(String[] ars) {
		
		
		
		
//		Car car = new Car();
//		System.out.println(car.engine.fuel);
//		
//		car= null;
		
		Engine engine = new Engine();
		Car car = new Car(engine);
		car = null;
	}
}
