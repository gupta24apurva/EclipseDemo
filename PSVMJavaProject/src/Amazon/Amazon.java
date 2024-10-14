package Amazon;

public abstract class Amazon {

	public abstract double calcDiscount(double amt);
}

class AmazonSeller extends Amazon{
	public double calcDiscount(double amt)
	{
		return 0.02*amt;
	}
}

class SellerWithAdditionalDiscount extends AmazonSeller{
	private double sellerDisc;
	public SellerWithAdditionalDiscount(double sellerDisc)
	{
		this.sellerDisc=sellerDisc;
	}
	
	@Override
	public double calcDiscount(double amt)
	{
		return super.calcDiscount(amt)+(amt*sellerDisc);
	}
}

class SellerWithPrimeDiscount extends SellerWithAdditionalDiscount{
	private double primeDisc;
	public SellerWithPrimeDiscount(double sellerDisc, double primeDisc)
	{
		super(sellerDisc);
		this.primeDisc=primeDisc;
	}
	
	@Override
	public double calcDiscount(double amt)
	{
		return super.calcDiscount(amt)+(amt*primeDisc);
	}
}
