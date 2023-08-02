
public class FibonacciSeries 
{
	int f1 = 0;
	int f2 = 1;
	void fibonacciSeries(int n) 
	{
		if(n == 1)
			System.out.println(f1);
		else if(n == 2)
			System.out.println(f1+" "+f2);
		else
		{
			System.out.print(f1+" "+f2+" ");
			for(int i = 3; i <= n; i++)
			{
				int next = f1 + f2;
				System.out.print(next+" ");
				f1 = f2;
				f2 = next;
			}
		}
	}
}
