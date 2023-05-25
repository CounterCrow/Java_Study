package com.mycopany.java_Study.ch02;

public abstract class Study_Remind01 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//------처음 입력
		System.out.println("HelloWrold");
		boolean a = true;
		boolean b = false;
		
		int c = 1;
		
		System.out.println(b);
		System.out.println(c);
		System.out.println("-------------boolean--------------");
//------boolean
	
		boolean default1NY = true;
		boolean default2NY = false;
//대입 연산자와 비교 연산자의 차이를 인지하자 '='는 대입 연산자 "=="는 비교 연산자이다.		
		if(default1NY== default2NY) {
			System.out.println("HelloWorld");
		}else {
			System.out.println("HellWorld");
		}
		;
		System.out.println("-------------byte--------------");
//------byte
		//바이트의 경우 -128~127까지 표현 가능
		byte test1 = -128;
		byte test2 = 127;
		System.out.println(test1);
		System.out.println(test2);
		System.out.println("--------------Char-------------");
//------Char
		char test3 = 'A';
//		char test4 = "A";		//""사용x
//		char test5 = 'AA';	//문자2개 사용x
		char test6 = 65;		//아스키코드
		char test7 = '\u0041';	//16진수
		System.out.println(test3);
//		System.out.println(test4);
//		System.out.println(test5);
		System.out.println(test6);
		System.out.println(test7);
		System.out.println("--------------FloatDouble-------------");
//------FloatDouble
		float test8=3;
		float test9=3.14f;
		float test10=3.14F;
		//float 입력값 뒤에 'f'혹은'F'를 넣으면 소수점 아래도 표시된다.
		//하지만 소수점 7자리를 넘어가면 올림으로 표시된다.
		System.out.println(test8);
		System.out.println(test9);
		System.out.println(test10);
		double test11 = 3.14;
		double test12 = 1231111111;
//		test12경우 1.231111111E9로 출력되는데 여기서 E9는 10의-9승을 의미한다.
//		double test13 = 123111111111;
//		double test14 = 123111111111;
		System.out.println(test11);
		System.out.println(test12);
//		System.out.println(test13);
//		System.out.println(test14);
		System.out.println("-------------int--------------");
//---------------INT
		int test15 = 11; // 10진수
		int test16 = 013; // 8진수
		int test17 = 0xb; // 16진수  9를 넘어가면 0x알파벳으로 16까지를 표시
		System.out.println(test15);
		System.out.println(test16);
		System.out.println(test17);
		System.out.println("-------------Long--------------");
//-------------long
		long test18 = 10;
		long test19 = 1012121212121212l; //long의 경우 오버레인지가 나면 뒤에 'l'이나'L'을 붙인다.
		System.out.println(test18);
		System.out.println(test19);
		System.out.println("-------------Promotion--------------");
//-------------Promotion
//		byte<short<int<long<float<double
		byte byte1 = 10;
		short  short1 = byte1;
		int int1 = short1;
		long long1 = int1;
		float float1 = long1;
		double double1 = float1;
		System.out.println(double1);//Promotion은 작은 풀에서 큰 풀로 넘기는것을 말한다.
		
	}

}
