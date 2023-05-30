package com.mycopany.java_Study.ch03;

public class EXDenyLogicOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//ch03.03
		
		//논리 부정 연산자(i)
		
		boolean play = false;
		
		play =!play;
		
		System.out.println("play: "+play);
		System.out.println("-----------------------");
		
		int i=3;
		
		if(!(i==3)) {
			System.out.println("helloWord");
		}else{
			System.out.println("hellWord");
		}
	}

}
