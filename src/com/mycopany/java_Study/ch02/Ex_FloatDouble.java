package com.mycopany.java_Study.ch02;

public class Ex_FloatDouble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double var1 = 3.0;
		double var2 = 3;
		
		double var3 = 3.14;
		float var4 = 3.14f;
		//소숫점7자리까지 나오고 아래값은 올림 되는듯?
		float var5 = 3.14159263F;
		System.out.println("var1: "+ var1);
		System.out.println("var2: "+ var2);
		
		System.out.println("var3: "+ var3);
		System.out.println("var4: "+ var4);
		System.out.println("var5: "+ var5);
		
		double var6 = 1234567;
		double var7 = 12345678;
		System.out.println("var6: "+ var6);
		System.out.println("var7: "+ var7);
		//E7의 경우 10의 -7승을 했다라는 의
	}

}
