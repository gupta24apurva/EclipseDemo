package Amazon;
import java.util.Scanner;

public class AmazonRunner {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the price of product");
		int price=sc.nextInt();
		
		Amazon obj1=new AmazonSeller();
		System.out.println("Price after amazon discount: "+(price-obj1.calcDiscount(price)));
		
		Amazon obj2=new SellerWithAdditionalDiscount(0.1);
		System.out.println("Price after amazon and seller discount: "+(price-obj2.calcDiscount(price)));
		
		Amazon obj3=new SellerWithPrimeDiscount(0.1,0.03);
		System.out.println("Price after amazon and seller and prime discount: "+(price-obj3.calcDiscount(price)));
		sc.close();
	}
}
