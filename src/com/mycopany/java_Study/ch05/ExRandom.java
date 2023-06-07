package com.mycopany.java_Study.ch05;

import java.util.Arrays;
import java.util.Random;
public class ExRandom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int min = 1;
		int max = 45;
		int random = (int)((Math.random()*(max-min))+min);
		System.out.println("random: "+ random);
		
		
		
		
		int[] lotto = new int[45];
		int i = 0;
		while(i<45) {
			lotto[i] = i+1;
			i++;
		}
		System.out.println(Arrays.toString(lotto));
		System.out.println("------------------------------------");
		Random pick = new Random();
		int[] nums = new int[6];
		for(int j=0;j<=5;j++) {
			int a = pick.nextInt(45);
			nums[j] = lotto[a];
			}
		
		Arrays.sort(nums);
		if(nums[0]!=nums[1]&&nums[1]!=nums[2]&&nums[0]!=nums[2]) {
			System.out.print(Arrays.toString(nums));	
		}else {
			System.out.print("다시 돌려주세요.");
				}
			
		
		
		
		
		} 
		
		
		
	}


