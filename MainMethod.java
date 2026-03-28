class MainMethod{
	public static void main(String [] Main){
		String output = PassPort.validationCheck("Mohammed", 20);
		System.out.println(output);
		System.out.println("##########################################################");
		String passed = StudentGrade.checkgrade("Mohammed", 76);
		System.out.println(passed);
		System.out.println("##########################################################");
		String alert = MobileData.checkDataLimit("Mohammed",49);
		System.out.println(alert);
	}
}