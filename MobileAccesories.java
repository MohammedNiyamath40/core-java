class MobileAccesories{
	static void topicName(){
		System.out.println("Mobile Accesories");
	}
	static void mobileAccesories(String chargerName, int wireWaat,char symbol, double powerBankMah){
		System.out.println("Charger Name: "+chargerName);
		System.out.println("Wire Waat: "+wireWaat+symbol);
		System.out.println("Power Bank MAH: "+powerBankMah);
	}
	static double temperGlassAndPouch(){
		double temperGlass = 150.00;
		double pouch = 150.00;
		double total = temperGlass + pouch;
		return total;
	}
	static int ordersOfAccessories(int temperGlasses, int pouchCount, int chargerBox , int cables){
		int totalOrder = temperGlasses + pouchCount + chargerBox + cables;
	    return totalOrder;
	}
}