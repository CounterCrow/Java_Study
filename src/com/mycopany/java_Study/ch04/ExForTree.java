package com.mycopany.java_Study.ch04;

public class ExForTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1.(10*5) 별나열
		
		
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=10; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("-----------------");
		//2.(1,5번째) 별나열
		for(int i=1; i<=5; i++) {
			if(i==1||i==5) {
			for(int j=1; j<=10; j++) {
				System.out.print("*");
			}
			
			}else {
				for(int k=1; k<=10; k++) {
					if(k>=2&&k<=9) {
						System.out.print("*");
					}else {
						System.out.print("*");
					}
			}
			}
			System.out.println();
		}
		System.out.println("-----------------");
				
				
	
		
	}
}
