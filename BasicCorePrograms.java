package com.bridgelabz.BasicCorePrograms;

import java.util.Scanner;

public class BasicCorePrograms 
{
	
	public static void main(String[] args) {
		int n; 
	       Scanner sc = new Scanner(System.in);  
	       System.out.println("Enter the Number:");  
	       n=sc.nextInt();
	       if (n % 2 == 0)
	       {
	    	   System.out.println("Even Number");
	       }
	       else
	       {
	    	   System.out.println("Odd Number");
	       }
	    }    
	}  