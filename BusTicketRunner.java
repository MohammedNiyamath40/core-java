class BusTicketRunner{
	public static void main(String[] busTicket){
		BusTicket.numberPlate = "KA-11-MD-0001";
		BusTicket.driverName = "QWERTY";
		BusTicket.conductorName = "zxcvbnm";
		
		BusTicket person1 = new BusTicket();
		person1.fromPlace = "Mandya";
		person1.toPlace = "Banglore";
		person1.numberOfPerson = 5;
		System.out.println("Number Plate Of Bus Is : " + BusTicket.numberPlate);
		System.out.println("Driver Name : " + BusTicket.driverName);
		System.out.println("Conductor Name : " + BusTicket.conductorName);
		System.out.println("PERSON1 IS FROM "+person1.fromPlace+ " going to "+ person1.toPlace + " with "+person1.numberOfPerson+" peoples.");
		
	}
}