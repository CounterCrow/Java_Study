package com.mycopany.java_Study.ch03;

public class ExConditionalOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//ch03.10
		
		//삼항 연산자(조건식)? A:B
		int math = 85;
		
		char grade = (math>90)?'A' : 'B';
		
		System.out.println("grade: "+grade);
		
		if(math>90) {
			grade = 'A';
		}else {
			grade = 'B';
		}
		System.out.println("grade: "+grade);
		
	}

}
