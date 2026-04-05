class ClothsRunner{
	public static void main(String[] cloths){
		Cloths.brandName();
		Cloths.price(5000);
		char size = Cloths.sizeOfShirt();
		System.out.println(size);
		String colorOfL = Cloths.color("White");
		System.out.println(colorOfL);
	}
}