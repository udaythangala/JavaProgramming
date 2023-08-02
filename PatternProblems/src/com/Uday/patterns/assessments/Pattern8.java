package com.Uday.patterns.assessments;

import java.util.Scanner;

public class Pattern8
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter range to print pattern : ");
		int n = sc.nextInt();
		sc.close();
		for(int i = n; i >= 1; i--) {
			for(int j = i; j >= 1; j--) {
				System.out.print(" ");
			}
			for(int j = i; j <= n; j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}

}
