package com.Uday.patterns.assessments;

import java.util.Scanner;

public class Pattern16 {
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
			int temp = 1;
			for (int k = 1; k <= i; k++)
			{
				System.out.print((char) (ch - 1 + temp) + " ");
				temp = temp * (i - k) / (k);
			}
			System.out.println();
		}
	}
}
