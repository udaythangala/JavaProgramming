import java.lang.Math;
public class AmstrongNumber {
	public int amstrongNumber(int n, int count)
	{
		
		int rev = 0;
		while(n != 0)
		{
			int rem = n % 10;
			rev = (int)(rev +Math.pow(rem, count));
			n = n / 10;
		}
		return rev;
	}
}
