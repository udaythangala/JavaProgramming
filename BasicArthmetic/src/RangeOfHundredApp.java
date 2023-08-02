public class RangeOfHundredApp 
{
	public static void divTwo(int n) 
	{
		System.out.println("Printing Even's in the range");
		for(int i = 1; i <= n; i++)
		{
			if(i % 2 == 0)
			{
				System.out.println(i);
			}
		}
	}
	public static void divThree(int n)
	{
		System.out.println("Printing the numbers divided by 3 in the provided range");
		for(int i = 1; i <= n; i++)
		{
			if(i % 3 == 0)
			{
				System.out.println(i);
			}
		}
	}
	public static void divFive(int n)
	{
		System.out.println("Printing the numbers divided by 5 in the provided range");
		for(int i = 1; i <= n; i++)
		{
			if(i % 5 == 0)
			{
				System.out.println(i);
			}
		}
	}
	public static void divTwoFive(int n)
	{
		System.out.println("Printing the numbers divided by 2 and 5 in the provided range");
		for(int i = 1; i <= n; i++)
		{
			if(i % 2 == 0 && i % 5 == 0)
			{
				System.out.println(i);
			}
		}
	}
	public static void divThreeFive(int n)
	{
		System.out.println("Printing the numbers divided by 3 and 5 in the provided range");
		for(int i = 1; i <= n; i++)
		{
			if(i % 3 == 0 && i % 5 == 0)
			{
				System.out.println(i);
			}
		}
		System.out.println("Printing the prime numbers in the provided range");
	}
	public static void prime(int n)
	{
		int count = 0;
		for(int i = 3; i <= n; i++)
		{
			int res = checkPrime(i);
			if(res != 0)
			{	
				System.out.println(res);
				count++;
			}
		}
		System.out.println("Number Of Prime Numbers is = "+count);
	}
	public static int checkPrime(int number)
	{
		for(int i=2;i<number;i++)
		{
			if(number%i==0)
			{
				return 0;
			}
		}
		return number;
	}
	public static void evenDivThree(int n)
	{
		System.out.println();
		System.out.println("Printing the numbers which are even and  divided by 3 in the provided range");
		for(int i = 1; i <= n; i++)
		{
			if(i % 2 == 0 && i % 3 == 0)
			{
				System.out.println(i);
			}
		}
	}
	public static void oddDivFive(int n)
	{
		System.out.println("Printing the numbers which are odd and divided by 5 in the provided range");
		for(int i = 1; i <= n; i++)
		{
			if(i % 5 == 0)
			{
				System.out.println(i);
			}
			i++;
		}
	}
	
}
