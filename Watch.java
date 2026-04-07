class Watch{
	static void wristWatch(){
		System.out.println("Watch Brand Name: Ricoh");
		material("Steel");
	}
	static void material(String made){
		int money = price();
		System.out.println("Price: "+money);
		System.out.println("Material: "+made);
	}
	static int price(){
		int amount = 2500;
		return amount;
	}
}