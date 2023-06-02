package com.mycopany.java_Study.ch05;

import java.util.Iterator;

public class ExArrayInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] score= {{100,90,80},{80,90,70},{70,60,50},{40,30,20},{80,20,50}};
		String[] name= {"장동건","차태식","마동석","마장동","마해영"};
	/*	
		for (int i = 0; i < score.length; i++) {
			for (int j = 0; j < score[i].length; j++) {
				System.out.println("arr["+i+"]["+j+"]: "+score[i][j]);
			}
				System.out.println("----------------------------");
		}
		*/
		int[] sum_arry = {0,0,0,0,0};
		int[] avg = {0,0,0};
		int sum = 0;
		
		for (int i = 0; i < name.length; i++) {
			int a = 0;
			int j = 0;
			while(a<score[i].length) {
				sum = sum+score[i][j];
				a++;
			}
			sum_arry[i]=sum;
			avg[i]=sum_arry[i]/score[i].length;
			System.out.println(name[i]+"의 점수합은"+sum_arry[i]+","+"점수평균은"+avg[i]+"입니다.");
			
		}
		System.out.println(sum_arry[3]);
		
	}

}
