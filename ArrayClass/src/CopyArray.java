import java.util.Arrays;
public class CopyArray {

	public static void main(String[] args) {
		 int arr[] = { 10, 20, 15, 22, 35, 56 };
		 System.out.println("Original Array is : "+ Arrays.toString(arr));
		 System.out.println("\nArray after change in size : "+ Arrays.toString(Arrays.copyOf(arr, 10)));

	}

}
