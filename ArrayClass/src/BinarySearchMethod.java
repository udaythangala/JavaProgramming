import java.util.Arrays;
import java.util.Scanner;
public class BinarySearchMethod
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in); 
		int arr[] = { 10, 20, 15, 22, 35, 109, 56, 89, 230 };
        Arrays.sort(arr);
        System.out.println("Enter number to search :");
        int key = sc.nextInt();
        System.out.println(key + " found at index = "+ Arrays.binarySearch(arr, key));
        int temp = Arrays.binarySearch(arr, key);
        if (temp != Arrays.binarySearch(arr, key))
        {
        	System.out.println("Not in  array");
        }
        sc.close();
	}

}
