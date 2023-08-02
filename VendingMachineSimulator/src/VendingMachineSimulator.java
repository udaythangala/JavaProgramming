import java.util.Scanner;

public class VendingMachineSimulator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter product code :");
		String productCode = sc.next();
		getProduct(productCode);
		sc.close();
	}
	public static void getProduct(String productCode)
	{
		
		switch (productCode)
		{
		case "po1":
			System.out.println("Coca Cola");
			break;
		case "p02":
			System.out.println("Monster");	
			break;
		case "p03":
			System.out.println("RedBull");
			break;
		case "p04":
			System.out.println("Fanta");
			break;
		case "p05":
			System.out.println("Merinda");
			break;
		case "p06":
			System.out.println("Maaza");
			break;
		case "p07":
			System.out.println("Sprite");
			break;
		case "p08":
			System.out.println("Thumbs Up");
			break;
		case "p10":
			System.out.println("Zeera");
			break;
		case "p11":
			System.out.println("Lizol");
			break;
		default:
			System.out.println("Ask for a Soft Drink Idiot !");
		}
	}

}
