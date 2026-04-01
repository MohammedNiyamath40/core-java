class Instagram{
	String firstName;
	String lastName;
	long phNo;
	String dob;
	String userName;
	
	public Instagram(String name1, String name2, long phNumber, String dateOfBirth, String name3){
		firstName = name1;
		lastName = name2;
		phNo = phNumber;
		dob = dateOfBirth;
		userName = name3;
	}
	
	public void details(){
		System.out.println(firstName);
		System.out.println(lastName);
		System.out.println(phNo);
		System.out.println(dob);
		System.out.println(userName);
	}
}