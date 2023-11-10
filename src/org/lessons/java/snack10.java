package org.lessons.java;

import java.util.Scanner;

public class snack10 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("input number: ");
		String strNumber1 = in.nextLine();
		System.out.print("input another number: ");
		String strNumber2 = in.nextLine();
		in.close();
		
		int num1 = Integer.valueOf(strNumber1);
		int num2 = Integer.valueOf(strNumber2);
		int count = 0;
		if(num1<num2) {
			for(int x = num1; x<=num2; x++) {
	//			System.out.println(count);
				count+=x;
			}	
		}
		else if(num1>num2) {
			for(int x = num2; x<=num1; x++) {
	//			System.out.println(count);
				count+=x;
			}
		}
		else {
			count = num1 + num2;
		}
		
		System.out.println(count);
	}
}
