package com.Uday.patterns.assessments;

public class Pattern25 {
	public static void main(String[] args)
	{
		System.out.println("Printing Pattern (L)");	
		System.out.println();
		for(int i = 0; i < 5; i++)
		{
			for(int j = 0; j < 5; j++)
			{
				if(j == 0 || i == 4  ) 
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
