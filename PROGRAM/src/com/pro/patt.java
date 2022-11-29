package com.pro;

public class patt {
	public static void main(String[] args) {
		int n=6;
		for (int i = 0; i < 3; i++) {
			
			for (int j = 0; j < 3; j++) {
				System.out.print(n+" ");
			}
			for (int k = 1; k <= 6; k++) {
				n++;
			}
			System.out.println();
		}
	}
}
