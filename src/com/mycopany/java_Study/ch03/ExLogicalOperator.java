package com.mycopany.java_Study.ch03;

public class ExLogicalOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//ch3.08
		
		//논리 연산자
		//		&&=& : and : 논리곱 : 연산 T&T=T,나머지는 F
		//		||=| : or : 논리합 : 연산 T|F=T, F|T=T, T|T=T,F|F=F
		//		^=베타적 논리합 : 연산 T^T=F, F^F=F,T^F=T,F^T=T
		
		int a= 65;
		
		if(a>=65&&a<=70) {
			System.out.println("&&: True");
		}
		if(a>=65&a<=70) {
			System.out.println("&: True");
		}
		if(a>65&&a<=70) {
			System.out.println("&&: True");
		}else {
			System.out.println("&&: False");
		}
		//F||T
		if(a>65||a<=70) {
			System.out.println("||: True");
		}else {
			System.out.println("||: False");
		}
		//F^T
		if(a>65^a<=70) {
			System.out.println("^: True");
		}else {
			System.out.println("^: False");
		}
		//T^T
		if(a>=65^a<=70) {
			System.out.println("^2: True");
		}else {
			System.out.println("^2: False");
		}
		
	}

}
