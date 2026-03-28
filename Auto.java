class Auto{
	static int wheel = 3;
	static String fuel = "CNG";
	static byte gear = 4;
	public static void main(String [] args){
		
		String color;
		short oilMl ;
		double price ;
		
		color = "Black";
		oilMl = 300;
		price = 700000;

		
		System.out.println("Wheel: "+wheel);
		System.out.println("Fuel: "+fuel);
		System.out.println("Gear: "+gear);
		System.out.println("Color: "+color);
		System.out.println("Oil ML: "+oilMl);
		System.out.println("Price :"+price);
		
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
		
		String fuel = "Gas HP/Bharat";
		byte gear = 3;
		color = "Yellow";
		oilMl = 200;
		price = 900000;
		
		
		System.out.println("Wheel: "+wheel);
		System.out.println("Fuel: "+fuel);
		System.out.println("Gear: "+gear);
		System.out.println("Color: "+color);
		System.out.println("Oil ML: "+oilMl);
		System.out.println("Price :"+price);
		
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
		
		color = "Black";
		oilMl = 350;
		price = 100000;
		System.out.println("Wheel: "+Auto.wheel);
		System.out.println("Fuel: "+Auto.fuel);
		System.out.println("Gear: "+Auto.gear);
		System.out.println("Color: "+color);
		System.out.println("Oil ML: "+oilMl);
		System.out.println("Price :"+price);
        
		
	}
}