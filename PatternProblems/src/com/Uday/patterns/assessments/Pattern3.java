package com.Uday.patterns.assessments;

import java.util.Scanner;

public class Pattern3 {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a word: ");
		String word = sc.nextLine();
		System.out.print("Enter no.of lines: ");
		int n = sc.nextInt();
		int c = 0;
		sc.close();
		for(int i = 0; i < n; i++) 
		{
			for (int j = 0; j <= n-i; j++) 
				System.out.print(" ");
			for(int k = 0; k <= i; k++)
			{
				System.out.print(word.charAt(c) + " ");
				c++;
				if(c == word.length())
					c = 0;
			}
			System.out.println(); 
		}
	}
}
