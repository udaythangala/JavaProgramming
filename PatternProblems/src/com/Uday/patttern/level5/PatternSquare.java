package com.Uday.patttern.level5;

public class PatternSquare {

	public static void main(String[] args) {
		for(int i = 0; i <= 2; i++)
		{
			for(int j = 0; j <= 2; j++)
			{
				if(i == 1 && j == 1)
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
