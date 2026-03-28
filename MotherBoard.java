class MotherBoard{
	static String brand = "OPPO";
	static String chipSet = "Z790";
	static String socketType = "LGA1700"; 
	
	public static void main(String [] args){
		int ramSlots = 4;
		int sataPorts = 6;
		int usbPorts = 10;
		
		System.out.println("Brand :"+brand);
		System.out.println("Chipset :"+chipSet);
		System.out.println("Socket Type :"+socketType);
		System.out.println("RAM slots :"+ramSlots);
		System.out.println("SATA Ports :"+sataPorts);
		System.out.println("USB Ports :"+usbPorts);
		
	}
}