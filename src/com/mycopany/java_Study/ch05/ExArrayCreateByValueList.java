package com.mycopany.java_Study.ch05;

public class ExArrayCreateByValueList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//[]선언시 앞이던 뒤던 상관없다.
		/*
		int[] scoreEnglish;
		int[] scoreMath;
		
		String[] name;
		String[] name2;
		
		double[] total;
		double[] avg;
		
		char[] grade121201;
		char[] grade121202;
		
		boolean[] score;
		boolean[] score2;
		*/
		//int scorePhysics;
		//scorePhysics = {100,90,80,70,60}; ---error
		//선언과 동시에 초기화
		
		int[] scoreChemistry = {100,90,80,70,60};
//		scoreChemistry[7]= 50; 컴파일 오류
		scoreChemistry[0]=0;
		
		String[] scoreStudent = {"Student1","Student2","Student3","Student4","Student5"};
		
		char[] level = {'a','b','c','d','f'};
		//System.out.println(scoreChemistry.length);
		int sum=0;
		int a = scoreChemistry.length;
			for (int i = 0; i < a; i++) {
			sum = sum + scoreChemistry[i];
			System.out.println(scoreChemistry[i]);
			}
			System.out.println("--------------------------");
			System.out.println(sum);
			System.out.println("--------------------------");
		int i=0;
		int sum2 = 0;
		while(i<a) {
			sum2 = sum2 + scoreChemistry[i];
			System.out.println(scoreChemistry[i]);
			i++;
		}
		System.out.println("--------------------------");
		System.out.println(sum2);
		System.out.println("--------------------------");
		int sum3 = 0;
		for(int aa: scoreChemistry) {
			sum3+= aa;
			System.out.println(aa);
		}
		System.out.println("--------------------------");
		System.out.println(sum3);
	}

}
