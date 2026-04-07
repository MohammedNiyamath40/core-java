class SamsungGalaxyA34{
	static void modelName(){
		System.out.println("Model:- SM-A346E/DSN");
		int battery = batteryMah();
		System.out.println("The Battery MAH is: "+battery);
	}
	static int batteryMah(){
		price(29000);
		int mahBattery = 5000;
		return mahBattery;
	}
	static void price(int amount){
		System.out.println("The Price Of Amount Is: "+amount);
	}
}