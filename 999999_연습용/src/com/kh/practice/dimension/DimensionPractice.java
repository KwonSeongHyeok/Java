package com.kh.practice.dimension;

public class DimensionPractice {

	public static void practice1() {
		String str[][] = new String[3][3];
		str[0][0] = "(0, 0)";
		str[0][1] = "(0, 1)";
		str[0][2] = "(0, 2)";
		str[1][0] = "(1, 0)";
		str[1][1] = "(1, 1)";
		str[1][2] = "(1, 2)";
		str[2][0] = "(2, 0)";
		str[2][1] = "(2, 1)";
		str[2][2] = "(2, 2)";
		
		for(int i = 0; i <str.length; i++) {
			for(int j = 0; j < str[i].length; j++) {
				System.out.print(str[i][j]);
			}
			System.out.println();
		}
	}
	
	public static void practice2() {
		int num[][] = {
				{1, 2, 3, 4},
				{5, 6, 7, 8},
				{9, 10, 11, 12},
				{13, 14, 15, 16}
		};
		for(int i = 0; i <num.length; i++) {
			for(int j = 0; j < num[i].length; j++) {
				System.out.print(num[i][j] + " ");
			}
			System.out.println();
		}
		
	}
	
	public static void main(String[] args) {
		// practice1();
		practice2();
		
		
	}

}
