class Facebook{
	static void userName(){
		System.out.println("niyamath_142");
		userGender('M');
	}
	static void userGender(char gender){
		System.out.println("Gender: "+gender);
		String date = dob();
		System.out.println("The user dob: "+date);
	}
	static String dob(){
		String dateOfBirth = "07-05-2005";
		return dateOfBirth;
	}
}