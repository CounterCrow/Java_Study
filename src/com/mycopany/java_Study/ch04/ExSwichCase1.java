package com.mycopany.java_Study.ch04;

public class ExSwichCase1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 1;
		
		switch(num) {
			case 1:
				System.out.println("1번이 나왔습니다.");
			break;
			case 2:
				System.out.println("2번이 나왔습니다.");
			break;
			default:
				System.out.println("3번이 나왔습니다.");
			break;
		}
		//사장 부장 과장 대리 주임 사원 나
		//사장의 연벙은 얼마입니다.
		
		String position = "사장";
		
		switch(position) {
		case "사원":
			System.out.println(position+"의 연봉은3,500만원입나다.");
			break;
		case "과장":
			System.out.println(position+"의 연봉은5,500만원입나다.");
			break;
		case "차장":
			System.out.println(position+"의 연봉은7,500만원입나다.");
			break;
		case "부장":
			System.out.println(position+"의 연봉은10,000만원입나다.");
			break;
		case "사장":
			System.out.println(position+"의 연봉은50,000만원입나다.");
			break;
		case "나":
			System.out.println(position+"의 연봉은3,500만원입나다.");
			break;
			
		}
		
		
		
	}

}
