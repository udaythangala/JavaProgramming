package com.Uday.patterns.assessments;

public class Pattern23 {
	public static void main(String[] args) {
		System.out.println("Printing Pattern (M)");	
		System.out.println();
		for(int i = 0; i < 5; i++)
		{
			for(int j = 0; j < 5; j++)
			{
				if(j == 0 || j == 4 || i == 1 && j == 1 || i == 2 && j == 2 || i == 1 && j == 3 ) 
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
