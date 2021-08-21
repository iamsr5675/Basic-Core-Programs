package com.bridgelabz.BasicCorePrograms;

import java.util.Scanner;

public class BasicCorePrograms 
{
	
	public static void main(String[] args) {
		int x, y, t; 
	       Scanner sc = new Scanner(System.in);  
	       System.out.println("Enter the value of X and Y");  
	       x = sc.nextInt();  
	       y = sc.nextInt();  
	       System.out.println("Before Swapping Numbers: "+x +"  "+ y);    
	       t = x;  
	       x = y;  
	       y = t;  
	       System.out.println("After Swapping: "+x +"   " + y);  
	       System.out.println( );  
	    }    
	}  