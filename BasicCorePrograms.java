package com.bridgelabz.BasicCorePrograms;

import java.util.Scanner;

public class BasicCorePrograms 
{
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int dividend, divisor, quotient, remainder;
		System.out.println("Enter the value of Dividend:");
		dividend = sc.nextInt();
		System.out.println("Enter the value of Divisor:");
		divisor = sc.nextInt();
		quotient = dividend / divisor;
		remainder = dividend % divisor;
		System.out.println("Value of Quotient : " +quotient);
		System.out.println("Value of Remainder : " +remainder);

	}
}