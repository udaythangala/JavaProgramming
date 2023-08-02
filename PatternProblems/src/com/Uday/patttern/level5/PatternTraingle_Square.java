package com.Uday.patttern.level5;

public class PatternTraingle_Square {

	public static void main(String[] args) {
		for( int i = 1; i < 4; i++)
		{
			for(int j = 2; j >= i; j--)
			{
				System.out.print(" ");
			}
			for(int k = 1; k < i * 2; k++)
			{
				if(i == 2 && k == 2)
				{
					System.out.print(" ");
					continue;
				}
				System.out.print("X");
			}
			System.out.println();
		}
		for(int i = 1; i <= 5; i++)
		{
			for(int j = 1; j <= 5; j++)
			{	
				if(i == 1 || i == 5 || j == 1 || j == 5)
				{
					System.out.print("X");
				}
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}
