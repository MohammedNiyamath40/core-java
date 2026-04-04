class MobilePouchRunner{
	public static void main(String[] mobilePouch){
		MobilePouch.brandName();
		MobilePouch.price(250);
		String colours = MobilePouch.colourPresent();
		System.out.println("The colors are: "+colours);
		String ordersPouch = MobilePouch.totalOrdersDetails("Mohammed");
		System.out.println("The person who has oreder pouch is: " +ordersPouch);
	}
}