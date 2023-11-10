package org.lessons.java;

public class snack9 {
	public static void main(String[] args) {
		
		int[] array = {1,2,3,4,5,6,7};
		
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
				System.out.println("ODD"+"key: "+countEven+" value: "+arrayEven[countEven]+" arrLength: "+lengthEven+" iteration: "+x);
				countEven++;
			}
			else {
				arrayOdd[countOdd]= array[x];
				System.out.println("EVEN"+"key: "+countOdd+" value: "+arrayOdd[countOdd]+" arrLength: "+lengthOdd+" iteration: "+x);
				countOdd++;

			}
		}
	}
}
