package com.codegnan.loopingstatements;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int number=scanner.nextInt();
		int reversed=0;
		int originalnumber=number;
		while(number!=0) {
			int reminder = number%10;
			reversed=reversed*10+reminder;
			number/=10;
		}
		if(originalnumber==reversed) {
			System.out.println("is palindrome : ");
		}
		else {
			System.out.println("Not a palindrome : ");
		}
		scanner.close();
		
   
	}

}
