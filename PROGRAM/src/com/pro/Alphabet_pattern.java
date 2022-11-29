package com.pro;

public class Alphabet_pattern {
	
	public static void main(String[] args) {
		char c= 'A';
		for (int i = 0; i < 4; i++) {
			for ( c = 'A'; c <=i; c++) {
				System.out.print(c);
			}
//			for (int j = i; j < 3; j++) {
//				System.out.print("* ");
//			}
//			for (int k = 0; k <=i+1; k++) {
//				System.out.print(alpha +" ");
//				alpha++;
//			}
			System.out.println();
		}
	}
}
