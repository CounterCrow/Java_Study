package com.mycopany.java_Study.ch05;

public class ExArrayCreateByNew {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr1 = new int[3];
//		arr1 = {1,2,3}; // err
		arr1[0] = 100;
		arr1[1] = 90;
		arr1[2] = 80;
		
		System.out.println("arr1.length: "+arr1.length);
		/*
		int[] arr2 = new int[3];
		for (int i = 0; i < arr2.length; i++) {
			arr2[i] = 10+10*i;
			System.out.println(arr2[i]);
		}
		*/
		
	}

}
