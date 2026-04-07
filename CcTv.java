class CcTv{
	static void brandName(){
		System.out.println("CP PLUS");
		rotation(360);
	}
	static void rotation(int swing){
		System.out.println("Roatation Degree: "+swing);
		int prices = price();
		System.out.println(prices);
	}
	static int price(){
		int amount = 2300;
		return amount;
	}
}