package com.swap.main;

import java.util.Scanner;

public class Swap {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number: ");
		int x = sc.nextInt();
		System.out.println("Enter the Second number: ");
		int y = sc.nextInt();
    
		y = x+y;
		x=y-x;
		y=y-x;
		System.out.println("The Swap number are : " + x +" " + y);
	}
	
}
