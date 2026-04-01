class Snapchat{
	String fullName;
	String email;
	long phNo;
	String dob;
	String userName;
	
	public Snapchat(String name, String mailId, long number, String dateOfBirth, String user){
		fullName = name;
		email = mailId;
		phNo = number;
		dob = dateOfBirth;
		userName = user;
	}
	public void details(){
		System.out.println(fullName);
		System.out.println(email);
		System.out.println(phNo);
		System.out.println(dob);
		System.out.println(userName);
	}
}