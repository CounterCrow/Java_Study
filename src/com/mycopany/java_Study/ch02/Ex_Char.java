package com.mycopany.java_Study.ch02;

public class Ex_Char {

		public static void main(String[] args) {
		// TODO Auto-generated method stub
		// char 에는 한문자만 들어갈 수 있다.
		//	아스킷코드표 
		char c1 = 'A'; 			//문자
		char c2 = 65; 		//십진수
		char c3 = '\u0041'; //16진수
//		char c1_1 = "A";		//오류 : ""사용 안됨
//		char c1_2 = 'AA';	//오류 : 한글자만 사용
		
		
		System.out.println("c1: "+ c1);
		System.out.println("c2: "+ c2);
		System.out.println("c3: "+ c3);
		
		char c4 = '가'; //문자
		char c5 = 44032; //십진수
		char c6 = '\uac00'; //16진수
		
		System.out.println("------------------");
		System.out.println("c4: "+ c4);
		System.out.println("c5: "+ c5);
		System.out.println("c6: "+ c6);
		
		int uniCord = c1;
		System.out.println("uniCord: "+ uniCord);
		int uniCord2 = c4;
		System.out.println("uniCord2: "+ uniCord2);
		}

}
