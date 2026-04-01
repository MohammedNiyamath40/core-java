class Flipcart{
	String userName;
	long phNo;
	String email;
	String address;
	String upiLink;
	
	public Flipcart(String name, long number, String mailId, String currentAddress, String phonepeLink){
		userName = name;
		phNo = number;
		email = mailId;
		address = currentAddress;
		upiLink = phonepeLink;
	}
	
	public void signinDetail(){
		System.out.println(userName);
		System.out.println(phNo);
		System.out.println(email);
		System.out.println(address);
		System.out.println(upiLink);
	}
}