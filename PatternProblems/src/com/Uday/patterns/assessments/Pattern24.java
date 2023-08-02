package com.Uday.patterns.assessments;

public class Pattern24 {

	public static void main(String[] args) {
		System.out.println("Printing Pattern (R)");	
		System.out.println();
		for(int i = 0; i < 6; i++)
		{
			for(int j = 0; j < 4; j++)
			{
				if(j == 0 || i == 0 || i == 2 || i == 1 && j == 3 || i == 5 && j == 3 || i == 3 && j == 1 || i == 4 && j == 2 ) 
				{
					if(i == 0 && j == 3 || i == 2 && j == 3)
						continue;
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
