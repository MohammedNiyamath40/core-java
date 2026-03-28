class MobileAccesoriesRunner{
	public static void main(String[] mobile){
		MobileAccesories.topicName();
		
		MobileAccesories.mobileAccesories("UNIX", 80, 'W', 10000.00);
		
		double amount = MobileAccesories.temperGlassAndPouch();
		System.out.println("The Total price of temper glass and pouch is :"+amount);
		
		int orders = MobileAccesories.ordersOfAccessories(200,100,50,50);
		System.out.println("The total numbers of accesories order including temper glass, pouch, charger, cable wire: "+ orders);
	}
}