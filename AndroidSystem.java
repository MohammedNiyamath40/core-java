class AndroidSystem{
	public AndroidSystem(){
		this("Samsung Galaxy Note 10 lite");
	}
	public AndroidSystem(String name){
		this(8, 128);
		System.out.println("Mobile Brand: "+name);
	}
	public AndroidSystem(int ram, int rom){
		this(4500, 13, 5.1f);
		System.out.println("Storage Details: Ram: "+ram+" and Rom: "+rom);
	}
	public AndroidSystem(int battery, int androidVersion, float uiVersion){
		this("1 april 2025", "Airtel", "VI", "SM-N770F/DSM");
		System.out.println("Battery and Android Version: Battery MAh: "+battery+", Android Version: "+androidVersion+", UI Version: "+uiVersion);
	}
	public AndroidSystem(String lastUpdate, String sim1, String sim2, String modelName){
		this("Red", true, true, "Type C", true);
		System.out.println("Software Updates and Sim details: Last Updated: "+lastUpdate+", Sim1 :"+sim1+", Sim2 :"+sim2+", Model Name: "+modelName);
	}
	public AndroidSystem(String color, boolean isDisplayFingered, boolean isPenPresent, String chargingType, boolean isDisplayOriginal){
		System.out.println("Apperance of the Mobile: Colour: "+color+", Is Display Finger Support :"+isDisplayFingered+", Is Pen Present :"+isPenPresent+", Charging Type: "+chargingType+ ", Is Display Original: "+isDisplayOriginal);
	}
}