package com.Uday.patterns.assessments;
import java.util.Scanner;
public class Pattern1 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a word: ");
		String word = sc.nextLine();
		sc.close();
		for (int i = 0; i < word.length(); i++) 
		{
			for (int j = 0; j <= word.length() / 2; j++) 
			{
				if(i == word.length() / 2 )
				{
					System.out.print(word);
					break;
				} 
				else
				{
					if(j == word.length() / 2)
						System.out.print(word.charAt(i));
					else
						System.out.print(" "); 
				}
			}
			System.out.println();
		}
	}
}

