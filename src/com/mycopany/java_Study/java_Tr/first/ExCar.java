package com.mycopany.java_Tr.first;

public class ExCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car car = new Car();
		
		System.out.println("car:name: "+car.name);
		System.out.println("car:engin: "+car.engin);
		System.out.println("car:company: "+car.company);
		System.out.println("car:color: "+car.color);
		car.go();
		car.stop();
		
	}

}
