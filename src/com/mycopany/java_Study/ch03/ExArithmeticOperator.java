package com.mycopany.java_Study.ch03;

public class ExArithmeticOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// ch03.04
		
		// 산술 연산자(+,-,*,/,%)
//		int 변수 v1에 초기값 5
//		int 변수 v2에 초기값 2
		
//		int 변수 result1 에 +연산 후 출력
//		int 변수 result2 에 -연산 후 출력
//		int 변수 result3 에 *연산 후 출력
//		int 변수 result4 에 /연산 후 출력
//		int 변수 result5 에 %연산 후 출력
//		double 변수 result6 에 %연산 후 출력(double)캐스팅 사용		
		
		int v1= 5;
		int v2= 2;
		
		int result1=v1+v2;
		System.out.println("result1: "+result1);
		int result2=v1-v2;
		System.out.println("result2: "+result2);
		int result3=v1*v2;
		System.out.println("result3: "+result3);
		int result4=v1/v2;
		System.out.println("result4: "+result4);
		int result5=v1%v2;
		System.out.println("result5: "+result5);
		
		double result6 = (double)v1/v2;
		System.out.println("result6: "+result6);

	}

}
