package com.mycopany.java_Study.ch04;

public class TrExif123remind {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//ch04.01
		/* if - 학점 계산
		내점수 81
		90>=a .........59<=f */
		System.out.println("-----ch04.01----");
		int score = 65;
		
		if(score>=90) {
			if(score>=97) {
				System.out.println("당신의 학점은 A+입니다.");
			}else if(score<=93)
				{
				System.out.println("당신의 학점은 A-입니다.");
			}else {
				System.out.println("당신의 학점은 A입니다.");
				}
		}else if(score>=80) {
			if(score>=87) {
				System.out.println("당신의 학점은 B+입니다.");
			}else if(score<=83)
					{
				System.out.println("당신의 학점은 B-입니다.");
			}else {
				System.out.println("당신의 학점은 B입니다.");
				}
		}else if(score>=70) {
			if(score>=77) {
				System.out.println("당신의 학점은 C+입니다.");
			}else if(score<=73)
					{
				System.out.println("당신의 학점은 C-입니다.");
			}else {
				System.out.println("당신의 학점은 C입니다.");
				}
		}else if(score>=60) {
			if(score>=67) {
				System.out.println("당신의 학점은 D+입니다.");
			}else if(score<=63)
					{
				System.out.println("당신의 학점은 D-입니다.");
			}else {
				System.out.println("당신의 학점은 D입니다.");
				}
		}else {
			System.out.println("당신의 학점은 F입니다.");
		}
		System.out.println("-----ch04.02----");
		
		//ch04.02
//				일반:1 5% 할인적용
//				브론즈:2 10% 할인적용
//				실버:3 15% 할인적용
//				골드:4 20% 할인적용
//				플레티넘:5 2.7% 할인적용
				
//				정가 12000원인 실버 등급의 할인가는 : 102000원 입니다.
		
		int level = 5;
		int cost = 12000;
		
		double levelSale = level*0.05;
		
		if(level == 1) {
			double levelCost = (1-levelSale)*cost;
			System.out.println("정가는"+cost+"입니다."+" "+"일반등급 할인가는"+(int)levelCost+"입니다.");
		}else if
		(level == 2) {
			double levelCost = (1-levelSale)*cost;
			System.out.println("정가는"+cost+"입니다."+" "+"브론즈등급 할인가는"+(int)levelCost+"입니다.");
		}else if
		(level == 3) {
			double levelCost = (1-levelSale)*cost;
			System.out.println("정가는"+cost+"입니다."+" "+"실버등급 할인가는"+(int)levelCost+"입니다.");
		}else if
		(level == 4) {
			double levelCost = (1-levelSale)*cost;
			System.out.println("정가는"+cost+"입니다."+" "+"골드등급 할인가는"+(int)levelCost+"입니다.");
		}else if
		(level == 5) {
			double levelCost = (1-0.027)*cost;
			System.out.println("정가는"+cost+"입니다."+" "+"플레티넘등급 할인가는"+(int)levelCost+"입니다.");
		}else {
			System.out.println("회원등급이 없습니다. 정가는 "+cost+"입니다.");
		}
		System.out.println("-----ch04.03----");
		//ch04.03
//				int 타입의 변수를 1개 선언하고	
//				짝수인지 홀수인지 판단하여 결과를 출력하는 프로그램을 작성하시요.
		int count = -1;
		
		if(count>0) {
			if(count%2==1) {
				System.out.println("홀수입니다.");
			}else {
				System.out.println("짝수입니다.");
			}
		}else {
			System.out.println("홀짝을 구분할 수 없습니다.");
		}
	}

}
