class Footwear{
	static void brandName(){
		System.out.println("Brinkenstock");
	}
	static void customerDetails(String customerName, long customerNumber, int customerSize){
		System.out.println("Customer Name : "+customerName);
	    System.out.println("Customer Number : "+customerNumber);
	    System.out.println("Customer Size : "+customerSize);
	}
	static double priceOfFootwear(){
		double price = 3000.00;
		return price;
	}
	static float customerBalance(float customerOne, float customerTwo, float customerThree){
		float balanceAmount = customerOne + customerTwo + customerThree;
		return balanceAmount;
	}
}