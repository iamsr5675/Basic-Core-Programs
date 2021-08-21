package com.bridgelabz.BasicCorePrograms;

import java.util.Scanner;

public class BasicCorePrograms 
{
	public static boolean isPrime(int n) {
		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

	static void primeFactors(int n) {
		for (int i = 2; i <= n; i++) {
			int t = n % i;
			if (t == 0) {
				if (isPrime(i))
					System.out.println(i + " ");
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to find the Prime Factors:");
		int n = sc.nextInt();
		System.out.println("Prime Factors are:");
		primeFactors(n);
		// System.out.println(isPrime(n));
		sc.close();

	}
}