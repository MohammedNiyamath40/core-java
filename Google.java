class Google{
	String firstName;
	String lastName;
	long phNo;
	String dob;
	String userName;
	
	public Google(String first, String last, long number, String dateOfBirth, String user){
		firstName = first;
		lastName = last;
		phNo = number;
		dob = dateOfBirth;
		userName = user;
	}
	
	public void details(){
		System.out.println(firstName);
		System.out.println(lastName);
		System.out.println(phNo);
		System.out.println(dob);
		System.out.println(userName);
	}
}