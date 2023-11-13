package org.lessons.java;

import java.util.Random;

public class snack3 {
	public static void main(String[] args) {
//		System.out.println("test");
		
		Random rnd = new Random(1);
		final int ARRAY_LENGTH = 10;
		
		int[] arrayOfNumbers = new int[ARRAY_LENGTH];
		
		for(int x=0; x<ARRAY_LENGTH; x++) {
			
			int newNumber = rnd.nextInt(0,100);
			arrayOfNumbers[x] = newNumber;
			System.out.println("number "+x+"value"+newNumber);
		}
		
		int sumOdd = 0;
		for(int x=1; x<ARRAY_LENGTH; x+=2) {
			
				sumOdd += arrayOfNumbers[x];
			
		}
		System.out.println("sum "+sumOdd);
		
	}
}
