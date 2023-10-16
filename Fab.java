package com.fab.main;

import java.util.Scanner;

public class Fab {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n = sc.nextInt();
		int fab = 0;
		
		for (int i = 0; i<=n;i++)
		{
			fab += i;
		}
     System.out.println("The Fabbonacci series of " + n + " is "+ fab);
	}

}
