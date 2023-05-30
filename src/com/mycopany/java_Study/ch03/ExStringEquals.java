package com.mycopany.java_Study.ch03;

public class ExStringEquals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//ch03.07
		
		//문자열 관련
		String str1 = "장원영";
		String str2 = "장원영";
		String str3 = new String("장원영");
//		(str1 == str2)은 주소값만 비교
		boolean result1 = (str1 == str2); 
		System.out.println("result1=" + result1);	// true
		
		boolean result2 = (str1 == str3); 
		System.out.println("result2=" + result2);	// false
//		str1.equals(str2)은 주소 안의 값을 비교		
		System.out.println("result3=" + str1.equals(str2));
		System.out.println("result4=" + str1.equals(str3));
	}

}
