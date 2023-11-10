package org.lessons.java;

import java.util.Random;

public class snack11 {
	public static void main(String[] args) {
		Random rnd = new Random();
		final int ARRAY_LENGTH = 5;
		int[] array = new int[ARRAY_LENGTH];
		
		int count =0;
		int min = 2147483647;
		int max = -2147483648;
		for(int x=0; x<ARRAY_LENGTH; x++) {
			int newNumber = rnd.nextInt(0,101);
			
			array[x] = newNumber;
			System.out.println("newNUmber: "+newNumber+" array: "+array[x]);
			count+=newNumber;
			if(newNumber<min) {
				min = newNumber;
			}
			if(newNumber>max) {
				max = newNumber;
			}
		}
		
		double avg = (double) count/ARRAY_LENGTH;
		
		System.out.println("max: "+max+" min: "+min+" avg:"+avg);
		
	}
}
