package com.prime.main;

import java.util.Scanner;

public class prime {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter the number you want to check : ");
		int n = sc.nextInt();
		
		for(int i =2 ; i<=n;i++)
		{
			boolean a = true;
			for(int j= 2;j<=i-1;j++)
			{
				if(i%j==0)
				{
					a= false;
					break;
				}
			}
			if(a==true)
			{
				System.out.print(" "+ i);
			}
		}
		System.out.println();
		
		

	}

}
