package com.Uday.patterns.assessments;

import java.util.Scanner;

public class Pattern4 {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a word: ");
		String word = sc.nextLine();
		System.out.println("Enter the no.of lines: ");
		int n = sc.nextInt();            
		for (int i = 0; i < n-1 ; i++)
		{
			for (int j = 0; j < i; j++)
			{
				System.out.print(" ");
			}
			for (int k = i; k <= n-1; k++) 
			{
				System.out.print(word.charAt(k) + " ");
			} 
			System.out.println("");
		} 
		for (int i = n-1; i >= 0; i--)
		{
			for (int j = 0; j < i ;j++)
			{
				System.out.print(" ");
			}
			for (int k = i; k <= n-1; k++)
			{
				System.out.print(word.charAt(k) + " ");
			}
			System.out.println("");
		}
		sc.close();

	}
}
