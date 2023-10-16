package com.armstrong.main;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Eneter the number you want to check: ");
		int n = sc.nextInt();
		int num= 0;
		int sum= 0;
		int count = 0;
		
		while(n!=0)
		{
			n = n/10;
			count++;
		}
    n = num;
		while(n!=0)
		{
			n = num%10;
			sum = sum + (int)Math.pow(n, count);
			n = n/10;
		}
		if (num == sum)
		{
			System.out.println("The Number is Armstrong");
		}
		else
		{
			System.out.println("The Number is not Armstrong");
		}
	}

}
