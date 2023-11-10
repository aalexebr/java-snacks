package org.lessons.java;

import java.util.Scanner;

public class snack5 {
	public static void main(String[] args) {

		
		Scanner in = new Scanner(System.in);
		boolean flag = false;
		do {
			System.out.print("insert string: ");
			String userString = in.nextLine();
			int strLen = userString.length();
			
			int letterCount = 0;
			int numberCount = 0;
			int specialChar = 0;
			
			
			for(int x=0; x<strLen; x++) {
				char c = userString.charAt(x);
				int n = Integer.valueOf(c);
				if((n<=90) && (n>= 65)) {
					letterCount++;
				}
				else if((n<=122) && (n>= 97)) {
					letterCount++;
				}
				else if((n<=57) && (n>= 48)) {
					numberCount++;
				}
				else {
					specialChar++;
				}
				if(n==48) {
					flag = true;
				}
				
//				System.out.println("letter: "+c+" Value: "+n);
			}
			System.out.println("letter: "+letterCount
						+" number: "+numberCount
						+" special: "+specialChar
						+" flag: "+flag);
			
		}while(flag == false);
		
		
		in.close();
	}
}
