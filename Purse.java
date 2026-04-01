class Purse{
	String brandName;
	String color;
	int slots;
	int price;
	
	public Purse(String p1, String p2, int p3, int p4){
		brandName = p1;
		color = p2;
		slots = p3;
		price = p4;
	}
	public void details(){
		System.out.println(brandName);
		System.out.println(color);
		System.out.println(slots);
		System.out.println(price);
	}
}