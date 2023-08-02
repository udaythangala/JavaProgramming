package com.Uday.patterns.assessments;

public class Pattern22 {

	public static void main(String[] args) {
		System.out.println("Printing Pattern (K)");	
		System.out.println();
		for(int i = 0; i < 5; i++)
		{
			for(int j = 0; j < 5; j++)
			{
				if(j == 0 || j == 4 && i == 0 || j == 3 && i == 1 || j == 2 && i == 2 || j == 3 && i == 3 || j == 4 && i == 4) 
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
