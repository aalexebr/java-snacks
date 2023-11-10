package org.lessons.java;

public class snack6 {
	public static void main(String[] args) {
		
		String numberAsString = "123456789";
		int n = 0;
		int power = 1;
		for(int x = (numberAsString.length()-1); x >=0; x--) {
			char c = numberAsString.charAt(x);
			int digit = 0;


			if(c == '0') {
				digit = 0;
				n+=(digit*power);
				power *= 10;
				continue;
			}
			if(c == '1') {
				digit = 1;
				n+=(digit*power);
				power *= 10;
				continue;
			}
			if(c == '2') {
				digit = 2;
				n+=(digit*power);
				power *= 10;
				continue;
			}
			if(c == '3') {
				digit = 3;
				n+=(digit*power);
				power *= 10;
				continue;
			}
			if(c == '4') {
				digit = 4;
				n+=(digit*power);
				power *= 10;
				continue;
			}
			if(c == '5') {
				digit = 5;
				n+=(digit*power);
				power *= 10;
				continue;
			}
			if(c == '6') {
				digit = 6;
				n+=(digit*power);
				power *= 10;
				continue;
			}
			if(c == '7') {
				digit = 7;
				n+=(digit*power);
				power *= 10;
				continue;
			}
			if(c == '8') {
				digit = 8;
				n+=(digit*power);
				power *= 10;
				continue;
			}
			if(c == '9') {
				digit = 9;
				n+=(digit*power);
				power *= 10;
				continue;
			}
//			n+=(digit*power);
//			power *= 10;
			
		}
		System.out.println(n);
	}
}
