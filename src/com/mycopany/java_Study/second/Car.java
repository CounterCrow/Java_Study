package com.mycopany.java_Study.second;

public class Car {

	// field
	int engin = 6;
	String name = "그랜다이저";
	String color = "검정";
	String company= "현다이";
	// method
	/*
	 * 기본생성자는 꼭 생성해둬야 한다.
	 * Car(){
		
	}
	*/
 Car(){
		
	}
	
 Car(String color){
		this.color =color;
	}
Car(int engin,String name,String color,String company ){
	this.engin =engin;
	this.name =name;
	this.color =color;
	this.company =company;
	
}
	void go(){
		System.out.println("앞으로 갑니다.");
		
	}
	void back(){
		System.out.println("뒤로 갑니다.");
	}

}
