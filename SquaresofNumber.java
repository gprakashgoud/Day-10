package com.codegnan.loopingstatements;

import java.util.Scanner;

public class SquaresofNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n=scanner.nextInt();
		for(int i=1; i<=n; i++) {
		System.out.println(i*i);
		}
		scanner.close();
		
		

	}

}
