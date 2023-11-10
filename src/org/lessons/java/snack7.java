package org.lessons.java;

//import java.text.DecimalFormat;

public class snack7 {
	public static void main(String[] args) {
		final int BASE_DIVIDOR = 60;
		int number = 13541;
		int seconds;
		int minutes;
		int hours;
//		DecimalFormat decimalFormat = new DecimalFormat("#.##");
//		double x = (double) number / VAR;
		
//		System.out.println(number % BASE_DIVIDOR);
		
		hours = number /(BASE_DIVIDOR*BASE_DIVIDOR);
		minutes = (number % (BASE_DIVIDOR*BASE_DIVIDOR))/BASE_DIVIDOR;
		seconds = number % BASE_DIVIDOR;
		
		System.out.println(number+" converted in time: "+hours+":"+minutes+":"+seconds);
		
		System.out.println("hrs:"+hours);
		System.out.println("min:"+minutes);
		System.out.println("secs:"+seconds);
	}
}
