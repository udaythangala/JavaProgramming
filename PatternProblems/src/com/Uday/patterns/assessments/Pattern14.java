package com.Uday.patterns.assessments;

import java.util.Scanner;

public class Pattern14 {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter range to print pattern : ");
		int n = sc.nextInt();
		sc.close();
		int temp = 1;
		System.out.println("");
		for (int i = 1; i <= n; i++)
		{
			for (int j = 1; j <= i; j++)
			{
				System.out.print(temp + " ");
				temp++;
			}
			System.out.println();
		}
	}
}
