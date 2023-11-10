package org.lessons.java;

import java.util.Scanner;

public class snack4 {
	
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		System.out.print("give me a word: ");
		
		String userWord = in.nextLine();
		
		
		int wordLength = userWord.length();
		
//		char[] arr = new char[wordLength];
		int z = wordLength-1;
		
		boolean flag = false;
		for(int x= 0; x<wordLength; x++) {
			char c = userWord.charAt(x);
			char s = userWord.charAt(z);
			z--;
			if (c == s) {
				flag = true;
			}
			
//			arr[x] = c;
		}
		
		
//		char[] invertedArr = new char[wordLength];
//		int var = 0;
//		for(int x= (wordLength-1); x>=0; x--) {
//			char n = arr[x];
//		
//			invertedArr[var]= n;
//			var++;
//			
//		}
//		
//		for(int x= 0; x<wordLength; x++) {
//			if(arr[x] == invertedArr[x]) {
//				flag = true;
//			}
//				
//		}
		
		if(flag) {
			System.out.println("palindrome");
		}
		else {
			System.out.println("nope");
		}
		
	}

}
