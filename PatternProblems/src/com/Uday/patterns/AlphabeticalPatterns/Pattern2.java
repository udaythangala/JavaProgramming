package com.Uday.patterns.AlphabeticalPatterns;

public class Pattern2 {

	public static void main(String[] args) {
		for(int i = 0; i <= 4; i++)
		{
			char ch = 'A';
			for(int j = 0; j <= i; j++)
			{
				System.out.print(ch);
				ch++;
			}
			System.out.println();
		}
	}
}
