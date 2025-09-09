package com.codegnan.loopingstatements;

import java.util.Scanner;

public class ReverseaNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int number=sc.nextInt();
		int originalnumber=number; 
		int reverseNumber=0;
	while(number!=0) {
		int reminder = number%10;
		reverseNumber = reverseNumber*10+reminder;
		number/=10;
		
	}
	System.out.println("Reverse of agiven number is :"+originalnumber+"="+reverseNumber);

	}

}
