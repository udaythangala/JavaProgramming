import java.util.Arrays;
import java.util.List;
public class AsListMethod {
	public static void main(String[] args) {
		 int arr[] = { 10, 20, 15, 22, 35 };
		 List<int[]> list = Arrays.asList(arr);
	     System.out.println("Integer Array as List: "+ list );
	}
}