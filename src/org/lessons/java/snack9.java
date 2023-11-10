package org.lessons.java;

public class snack9 {
	public static void main(String[] args) {
		
		int[] array = {1,2,3,4,5};
		
		int length = array.length;
		int lengthEven = 0;
		int lengthOdd = 0;
		
		for(int x =0; x<length; x++) {
			if(array[x]%2 ==0) {
				lengthEven++;
			}
			else {
				lengthOdd++;
			}
		}
		int[] arrayOdd = new int[lengthOdd];
		int[] arrayEven = new int[lengthEven];
		int countOdd = 0;
		int countEven = 0;
		for(int x =0; x<length; x++) {
			if(array[x]%2 ==0) {
				
				arrayEven[countEven]= array[x];
				countEven++;
			}
			else {
				arrayOdd[countOdd]= array[x];
				countOdd++;
			}
		}
	}
}
