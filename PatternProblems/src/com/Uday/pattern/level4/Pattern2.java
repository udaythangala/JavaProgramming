package com.Uday.pattern.level4;

public class Pattern2 {

	public static void main(String[] args) {
		for(int i = 1; i <= 5; i++)
		{
			for(int j = 0; j <= 4; j++)
			{
				System.out.print("#");
			}
			for(int j = 0; j <= 4; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
