class LeapYear{
	public static void main(String[] args){
		int year = 00;
		int leapYear = ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) ? 1 : 0;
		switch(leapYear){
			case 1:
			System.out.println(year+" is a Leap Year.");
			break;
			case 0:
			System.out.println(year+" is not a Leap Year.");
			break;
			default:
			System.out.println("Error in calculation.");
		}
	}
}