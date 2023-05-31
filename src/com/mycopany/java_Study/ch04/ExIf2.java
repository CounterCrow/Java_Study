package com.mycopany.java_Study.ch04;

public class ExIf2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//ch04.02
//		일반:1 5% 할인적용
//		브론즈:2 10% 할인적용
//		실버:3 15% 할인적용
//		골드:4 20% 할인적용
//		플레티넘:5 2.7% 할인적용
		
//		정가 12000원인 실버 등급의 할인가는 : 102000원 입니다.
		
		int grade = 5;
		int cost = 12000;
		
		if(grade==1)
		{
			System.out.println("정가는"+cost+"입니다."+"일반등급의 할인가는: "+(cost*0.95)+"원 입니다.");
		}else if
		(grade == 2) 
		{
			System.out.println("정가는"+cost+"입니다."+"브론즈등급의 할인가는: "+(cost*0.90)+"원 입니다.");
		}else if
		(grade == 3)
		{
			System.out.println("정가는"+cost+"입니다."+"실버등급의 할인가는: "+(cost*0.85)+"원 입니다.");
		}else if
		(grade == 4)
		{
			System.out.println("정가는"+cost+"입니다."+"골드등급의 할인가는: "+(cost*0.80)+"원 입니다.");
		}else if
		(grade == 5)
		{
			System.out.println("정가는"+cost+"입니다."+"플레티넘등급의 할인가는: "+(cost*0.973)+"원 입니다.");
		}else {
			System.out.println("정가는"+cost+"입니다.");
		}
		/*
		 double salesCost = 0.0;
		 
		 if(grade == 1){
		 	salesCost = cost*(1-0.05);
			System.out.println("정가는"+cost+"입니다."+"일반등급의 할인가는: "+(int)salesCost+"원 입니다.");
		 }else if
		 	(grade == 2) 
		 { salesCost = cost*(1-0.10);
			System.out.println("정가는"+cost+"입니다."+"브론즈등급의 할인가는: "+(int)salesCost+"원 입니다.");
		 }
		 
		  */
	}

}
