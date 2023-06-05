package com.mycopany.java_Study.ch05;

import java.util.ArrayList;
import java.util.Arrays;

public class TrArray01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 1
		 12
		 123
		 1234
		 12345
		 123456
		 1234567
		 12345678
		 123456789
		 1 3 5 7 90
		  
		 
		 */
		for(int i=1; i<=10; i++) {
			if(i == 10) {
				for(int j=1; j<=i-1; j++) {
					if(j%2==1) {
						System.out.print(j);
					} else {
						System.out.print(" ");
					}
				}
				System.out.println("0");
			} else {
				for(int j=1; j<=i; j++) {
					System.out.print(j);
				}
				System.out.println();
			}
		}
		
		
	}

}
