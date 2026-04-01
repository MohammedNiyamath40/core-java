class FaceBook{
	String fullName;
	String dob;
	long phNo;
	String email;
	
	public FaceBook(String name, String dateOfBirth, long phNumber, String emailId){
		fullName = name;
		dob = dateOfBirth;
		phNo = phNumber;
		email = emailId;
	}
	
	public void details(){
		System.out.println(fullName);
		System.out.println(dob);
		System.out.println(phNo);
		System.out.println(email);
	}
}