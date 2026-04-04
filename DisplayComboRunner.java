class DisplayComboRunner{
	public static void main(String[] display){
		DisplayCombo.brandName();
		DisplayCombo.price(1799);
		char rating = DisplayCombo.qualilty();
		System.out.println("The Qualilty of the display: "+rating);
		String customer = DisplayCombo.customerName("Mohammed");
		System.out.println("The customer Name is: "+customer);
	}
}