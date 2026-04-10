class ShowMobile{
	public static void main(String[] mobiles){
		String[] mobileModelPresent = new String[15];
		mobileModelPresent[0] = "Iphone 15 plus";
		mobileModelPresent[1] = "Iphone 14 plus";
		mobileModelPresent[2] = "Iphone 14";
		mobileModelPresent[3] = "Samsung Galaxy S21 FE 5g";
		mobileModelPresent[4] = "Samsung Galaxy A34 5g";
		mobileModelPresent[5] = "Oppo F31 5g";
		mobileModelPresent[6] = "Oppo Reno 7 5g";
		mobileModelPresent[7] = "Oppo K 13 turbo 5g";
		mobileModelPresent[8] = "Vivo V25 pro";
		mobileModelPresent[9] = "Vivo V23 pro";
		mobileModelPresent[10] = "Vivo V 27 pro";
		mobileModelPresent[11] = "Realme";
		mobileModelPresent[12] = "Vivo Y20 G";
		mobileModelPresent[13] = "Redmi K50 i";
		
		String[] chargerNames = new String[15];
		chargerNames[0] = "Oppo";
		chargerNames[1] = "Vivo";
		chargerNames[2] = "Apple";
		chargerNames[3] = "Samsung";
		chargerNames[4] = "Realme";
		chargerNames[5] = "Airi";
		chargerNames[6] = "Lyne";
		chargerNames[7] = "KWD";
		chargerNames[8] = "Unix";
		
		for(String mobile : mobileModelPresent){
			System.out.println("Mobile Present In Show Mobile: "+mobile);
		}
		for(String charger : chargerNames){
			System.out.println("Mobile Charger in Show Mobile :"+charger);
		}
		
		for(int i = 0; i < mobileModelPresent.length; i++){
			System.out.println("Mobile present :"+mobileModelPresent[i]);
		}
		for(int i = 0; i < chargerNames.length; i++){
			System.out.println("Charger Present :"+chargerNames[i]);
		}
	}
}