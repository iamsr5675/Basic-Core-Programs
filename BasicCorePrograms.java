package com.bridgelabz.BasicCorePrograms;

import java.util.Scanner;

public class BasicCorePrograms 
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i, n, heads=0, tails=0;
		System.out.println("Enter the number of times to flip the coin:");
		n = sc.nextInt();
		for(i=1; i<=n; i++)
		{
		if (Math.random() < 0.5)
		{
		System.out.println("Tails");
		tails++;
		}
		else
		{
		System.out.println("Heads");
		heads++;
		}
		}
		double heads_percentage = ((double)heads/n)*100;
		double tails_percentage = ((double)tails/n)*100;
		System.out.println("Percentage of Head : " +heads_percentage);
		System.out.println("Percentage of Tails : " +tails_percentage);
	}
}
