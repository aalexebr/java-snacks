package org.lessons.java;

public class snack6 {
	public static void main(String[] args) {
		
		String numberAsString = "123456789";
		int n = 0;
		int power = 1;
		for(int x = (numberAsString.length()-1); x >=0; x--) {
			char c = numberAsString.charAt(x);
			int digit = 0;

//			System.out.println(c);
			if(c == '0') {
				digit = 0;
			}
			if(c == '1') {
				digit = 1;
			}
			if(c == '2') {
				digit = 2;
			}
			if(c == '3') {
				digit = 3;
			}
			if(c == '4') {
				digit = 4;
			}
			if(c == '5') {
				digit = 5;
			}
			if(c == '6') {
				digit = 6;
			}
			if(c == '7') {
				digit = 7;
			}
			if(c == '8') {
				digit = 8;
			}
			if(c == '9') {
				digit = 9;
			}
//			System.out.println(n);
			n+=(digit*power);
			power *= 10;
			
		}
		System.out.println(n);
	}
}
