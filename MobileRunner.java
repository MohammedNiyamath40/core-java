class MobileRunner{
	public static void main(String[] mobile){
		Mobile mobile1 = new Mobile();
        mobile1.brand = "Samsung Galaxy Note 10 Lite.";
        mobile1.storage = 128;
        mobile1.price = 45999.00;
        mobile1.ram = 8;
        mobile1.isWaterProof = false;
        mobile1.chargingType = "C-Type";
        mobile1.batteryMah = 4500;
	System.out.println("Brand: "+mobile1.brand);
    System.out.println("Storage: "+mobile1.storage);
    System.out.println("Price: "+mobile1.price);
    System.out.println("RAM: "+mobile1.ram);
    System.out.println("Water Proof: "+mobile1.isWaterProof);
    System.out.println("Charing Type: "+mobile1.chargingType);
    System.out.println("Battery MAH: "+mobile1.batteryMah);
}
} 