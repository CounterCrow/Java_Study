package com.mycopany.java_Study.ch04;

public class ExIf4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		//ch04.04
		//int 타입의 변수를 2개 선언하고
		//두 정수가 주어졌을 때 사분면 어디에 해당되는지 출력하는 프로그램을 작성하시오.
		//(a,b)는 1사분면에 위치합니다.
		
		int a=0;
		int b=1;
		int c= a*b;
		
		if (c>0&&a>0) {
			System.out.println("1사분면에 있습니다.");
		}else if(c>0&&a<0) {
			System.out.println("3사분면에 있습니다.");
		}else if(c<0&&a>0) {
			System.out.println("4사분면에 있습니다.");
		}else if(c<0&&a<0) {
			System.out.println("2사분면에 있습니다.");
		}else if(c==0&&a!=0) {
			System.out.println("x축에 존재합니다.");
		}else if(c==0&&b!=0) {
			System.out.println("y축에 존재합니다.");
		}else {
			System.out.println("원점에 존재합니다.");
		}
		
		
		
		
		
	
	}

}
