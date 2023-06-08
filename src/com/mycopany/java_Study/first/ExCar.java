package com.mycopany.java_Study.first;

public class ExCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 1;
		System.out.println(a);
		
		Car car = new Car();		//생성 (기본생성자)
		System.out.println("car.neme: "+car.name);
		System.out.println("car.engin: "+car.engin);
		System.out.println("car.color: "+car.color);
		System.out.println("car.company: "+car.company);
		
		car.go();
		car.back();
		}

}
