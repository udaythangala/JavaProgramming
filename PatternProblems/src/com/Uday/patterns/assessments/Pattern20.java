package com.Uday.patterns.assessments;

public class Pattern20 {

	public static void main(String[] args)
	{
		System.out.println("Printing Pattern (A)");
		System.out.println();
		for (int i = 1; i <= 5; i++) 
		{
			for (int j = 1; j <= (5 * 2 - 1); j++)
			{
				if (j == 5 - i + 1 || j == 5 + i - 1)
				{
					System.out.print("A");
				}
				if(i == 3 && j == 4 || i == 3 && j == 5 )
					System.out.print("A");
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
