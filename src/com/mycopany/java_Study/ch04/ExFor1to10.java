package com.mycopany.java_Study.ch04;

public class ExFor1to10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1부터 10까지 더하는 프로그램 작성
		//1+1
		
		int sum = 0;
		for(int i=1; i<=10; i++) {
			sum = sum + i;
			System.out.println("i: "+i+"| sum"+sum);
			}
			System.out.println(sum);
			System.out.println("----------------");
	//11~50까지 수 중 짝수만 더한 값	
		/*
		int sum2 = 0;
		for(int i =6; i<=25; i++) {
			sum2 = sum2 + i*2;
		}
		System.out.println(sum2);
			*/
			int sum2=0;
			for(int i=11; i<=50; i++) {
				if(i%2==0) {
					sum2 += i;  //sum2 += i; 는 sum2 = sum2+ i;와 같다. 
					System.out.println("i: "+i+"| sum2 :"+sum2);
				}
				
				}
					System.out.println(sum2);
	}

}
