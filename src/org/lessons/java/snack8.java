package org.lessons.java;

import java.util.Scanner;

public class snack8 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("input string:");
		
		String userString = in.nextLine();
		int length = userString.length();
		in.close();
		String newStr = userString.replace('a', 'o');
		char[] newString = new char[length];
		for(int x=0; x<length; x++) {
			char c = userString.charAt(x);
//			System.out.println(c);
			if(c == 'a') {
				newString[x] = 'o';
			}
			else if(c == 'o') {
				newString[x] = 'a';
			}
			else {
				newString[x] = c;
			}
			
		}
		String str = new String(newString);
		System.out.println(str);
	}
}
