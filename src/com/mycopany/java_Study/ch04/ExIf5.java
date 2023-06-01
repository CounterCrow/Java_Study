package com.mycopany.java_Study.ch04;

public class ExIf5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a= 77;
		int b= 77;
		int c= 77;
		if(a!=b&&b!=c) {
			if(a>b&&b>c) {
					System.out.println("최대값은 a 최소값은 c 입니다.");
				}else if(a>b&&c>b&&a>c) {
					System.out.println("최대값은 a 최소값은 b 입니다.");	
				}else if(a>b&&c>b&&c>a) {
					System.out.println("최대값은 c 최소값은 b 입니다.");
				}else if(b>a&&b>c&&a>c) {
					System.out.println("최대값은 b 최소값은 c 입니다.");
				}else if(b>a&&b>c&&a<c) {
					System.out.println("최대값은 b 최소값은 a 입니다.");
				}else {
					System.out.println("최대값은 c 최소값은 a 입니다.");
				}
				
			}else if(a!=b&&b==c){
				if(a>b) {
					System.out.println("최대값은 a 이며 최소값은 b와c의 값입니다.--b와c의값이 동일합니다.");
				}else {
					System.out.println("최대값은 b와c의 값이며 최소값은a입니다.--b와c의값이 동일합니다.");
				}
			}else if(a==b&&b!=c){
				if(a>c) {
					System.out.println("최대값은 a와b의 값이며 최소값은 c의값입니다.--a와b의 값은 동일합니다.");
				}else {
					System.out.println("최대값은 c의 값이며 최소값은a와b의 값입니다.입니다.--a와b의값이 동일합니다.");
				}
			}else if(a==c&&b!=c){
				if(a>b) {
					System.out.println("최대값은 a와c의 값이며 최소값은 b의값입니다.--a와c의 값은 동일합니다.");
				}else {
					System.out.println("최대값은 b의 값이며 최소값은a와c의 값입니다.입니다.--a와c의값이 동일합니다.");
				}
			}else {
				System.out.println("3개의 값이 동일합니다.");
			}
		
		
		
		
		}

}
