class FootwearRunner{
	public static void main(String[] footwear){
		Footwear.brandName();
		
		Footwear.customerDetails("Mohammed", 7975106965l, 10);
		
		double price = Footwear.priceOfFootwear();
		System.out.println("The Price of  Footwear is :"+price);
		
		float balance = Footwear.customerBalance(600.00f, 1200.00f, 340.00f);
		System.out.println("The total Amount is balance from customer's are: "+balance);
	}
}