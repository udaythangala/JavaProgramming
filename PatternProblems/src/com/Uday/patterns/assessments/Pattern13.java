package com.Uday.patterns.assessments;

import java.util.Scanner;

public class Pattern13 {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter range to print pattern : ");
		int n = sc.nextInt();
		sc.close();
		System.out.println("");
		for (int i = n; i >= 1; i--)
		{
			for (int j = n; j >= i; j--)
			{
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
}
