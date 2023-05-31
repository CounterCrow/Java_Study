package com.mycopany.java_Study.ch04;

public class ExIf3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//ch04.03
//		int 타입의 변수를 1개 선언하고	
//		짝수인지 홀수인지 판단하여 결과를 출력하는 프로그램을 작성하시요.
		
		int a =0;
		int result = a%2;
		
		if
		(a>0&&a!=0&&result==0) {
			System.out.println("짝수 입니다.");
		}else if
		(a>0&&a!=0&&result==1){
			System.out.println("홀수 입니다.");
		}else {
			System.out.println("양의 정수가 아닙니다.");
		}
		
	}

}
