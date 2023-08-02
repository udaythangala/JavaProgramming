package SumOfNaturals.bin;

import java.util.Scanner;

public class SumOfNaturals 
{
		public static void main(String[] args)
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the value :");
			int n = sc.nextInt();
			System.out.println("The sum of N naturals is :"+n*(n+1)/2);
			sc.close();
		}

	}


