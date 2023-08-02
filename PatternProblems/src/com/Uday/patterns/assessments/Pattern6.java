package com.Uday.patterns.assessments;

import java.util.Scanner;

public class Pattern6 {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter range to print pattern : ");
		int n = sc.nextInt();
		System.out.println("Printing Pascals Traingle ");
		sc.close();
		System.out.println();
		for (int i = 1; i <= n; i++) 
		{ 
			for (int j = n; j > i; j--)
			{
				System.out.print("  ");
			}
			for (int k = 1; k <= i; k++) 
			{ 
				System.out.print(k + " "); 
			} 
			for (int l = i - 1; l >= 1; l--)
			{
				System.out.print(l + " ");
			}
			System.out.println();
		}
	}
}
