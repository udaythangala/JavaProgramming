package com.Uday.patterns.assessments;

import java.util.Scanner;

public class Pattern11 {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter range to print pattern : ");
		int n = sc.nextInt();
		sc.close();
		char ch = 'A';
		System.out.println("");
		for (int i = 1; i <= n; i++) 
		{ 
			for (int j = n; j > i; j--)
			{
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++)
			{
				System.out.print((char) (ch + i - 1) + " ");
			}
			System.out.println();
		}
	}
}
