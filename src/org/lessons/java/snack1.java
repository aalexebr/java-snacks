package org.lessons.java;

import java.util.Scanner;

public class snack1 {
	public static void main(String[] args) {
//		System.out.println("test");
		
		Scanner in = new Scanner(System.in);
		System.out.print("give me a number: ");
		String userInput = in.nextLine();
		in.close();
		int userNumber = Integer.valueOf(userInput+"");
		
		if(userNumber % 2 == 0) {
			System.out.print("print number is even so next numb is: "+userNumber);
		}
		else {
			System.out.print("print number: "+(userNumber+1));
		}
		
	}
}
