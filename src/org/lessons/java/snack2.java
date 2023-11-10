package org.lessons.java;

import java.util.Random;

public class snack2 {
	public static void main(String[] args) {
//		System.out.println("test");
		
		String[] nomi = {"Mario", "Luigi", "Giovanna", 
						"Anna", "Carlo", "Maria", "Luca", 
						"Giuseppe", "Elena", "Francesca"};
		String[] cognomi = {"Rossi", "Bianchi", "Verdi", 
						"Russo", "Ferrari", "Esposito", "Romano", 
						"Gallo", "Conti", "Marino"};
		
		int arrLength = nomi.length;
		String[] completeNames = new String[arrLength];
		
		Random rnd = new Random();
		
		
		for(int x=0; x<arrLength; x++) {
			
			int nameKey = rnd.nextInt(0,arrLength);
			int surnameKey = rnd.nextInt(0,arrLength);
			completeNames[x] = nomi[nameKey]+" "+cognomi[surnameKey];
			System.out.println(completeNames[x]);
		}
	}
}
