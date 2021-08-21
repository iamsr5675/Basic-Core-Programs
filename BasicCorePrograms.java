package com.bridgelabz.BasicCorePrograms;

import java.util.Scanner;

public class BasicCorePrograms 
{
	public void power(int n)
	{
	int a = 2, c = 1, res = 1;
	if (n >= 31)
	{
	System.out.println("Invalid input");
	}
    if (n == 0)
    {
    res=1;
    }
    if(n < 31)
    {
    	do{    
    		res = res * a;
            System.out.println(a+ " to the power " +c+ " is " +res);    
        c++;    
        }while(c <= n);
    }
	}
	public static void main(String[] args)
	{
	Scanner sc = new Scanner(System.in);
	BasicCorePrograms obj = new BasicCorePrograms();
	int d = sc.nextInt();
	obj.power(d);
	}
}