package com.Uday.patterns.assessments;

import java.util.Scanner;
public class Pattern2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a word: ");
		String word = sc.nextLine();
		sc.close();
		for(int i = 0; i < word.length() - 1; i++) 
		{
			for(int j = 0; j < word.length() - i-1; j++) 
			{
				System.out.print(" ");
			}
			for(int k = 0; k <= i ; k++)
			{
				System.out.print(word.charAt(k)); 
			}
			System.out.println(); 
		}
		for(int i = 0; i < word.length(); i++)
		{
			for(int j = 0; j < i; j++) 
			{
				System.out.print(" "); 
			}
			for(int k = i; k < word.length(); k++)
			{
				System.out.print(word.charAt(k)); 
			}
			System.out.println(); 
		}
	}
}