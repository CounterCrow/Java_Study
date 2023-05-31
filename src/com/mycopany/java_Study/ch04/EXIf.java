package com.mycopany.java_Study.ch04;

public class EXIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//ch04.01
		
		//if - 학점 계산
		
		int score = 88;
		
		if(score>= 90) {
			if(score>=97) {
				System.out.println("당신의 학점은 [A+] 입니다.");
			}else if(score<=93){
				System.out.println("당신의 학점은 [A-] 입니다.");
			}else {
			System.out.println("당신의 학점은 [A] 입니다.");
			}
		}else if(score>=80) {
			if(score>=87) {
				System.out.println("당신의 학점은 [B+] 입니다.");
			}else if(score<=83){
				System.out.println("당신의 학점은 [B-] 입니다.");
			}else {
				System.out.println("당신의 학점은 [B] 입니다.");}
		}else if(score>=70) {
			if(score>=77) {
				System.out.println("당신의 학점은 [C+] 입니다.");
			}else if(score<=73){
				System.out.println("당신의 학점은 [C-] 입니다.");
			}else {
				System.out.println("당신의 학점은 [C] 입니다.");}
		}else if(score>=60) {
			if(score>=67) {
				System.out.println("당신의 학점은 [D+] 입니다.");
			}else if(score<=63){
				System.out.println("당신의 학점은 [D-] 입니다.");
			}else {
				System.out.println("당신의 학점은 [D] 입니다.");}
			}else{
				System.out.println("당신의 학점은 [F] 입니다.");
		}
	}

}
