package com.Uday.patterns.assessments;

public class Pattern19 {

	public static void main(String[] args) {
		System.out.println("Printing Pattern (D)");	
		System.out.println();
		for(int i = 0; i < 5; i++)
		{
			for(int j = 0; j < 5; j++)
			{
				if(j == 0 || j == 4 || i == 0 || i == 4) 
				{
					if(j == 4 && i == 0 || j == 4 && i == 4)
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
