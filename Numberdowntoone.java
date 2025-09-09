package com.codegnan.loopingstatements;

import java.util.Scanner;

public class Numberdowntoone {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = scanner.nextInt();
		do {
			System.out.println(n);
			n--;
		}while(n>0);

	}

}
