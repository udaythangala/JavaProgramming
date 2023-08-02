package com.Uday.patterns.assessments;

public class Pattern17 {

	public static void main(String[] args) {
		System.out.println("Printing Pattern (T)  ");
		System.out.println();
		for(int i = 0;i < 5; i++)
		{
			for(int j = 0; j < 5; j++)
			{
				if(i == 0 || j == 2)
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
