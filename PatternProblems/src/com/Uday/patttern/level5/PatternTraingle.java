package com.Uday.patttern.level5;

public class PatternTraingle {

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
	}
}
