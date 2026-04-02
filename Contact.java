class Contact{
	String firstName;
	String lastName;
	long phNo;
	
	public Contact(String firstName, String lastName, long phNo){
		this.firstName = firstName;
		this.lastName = lastName;
		this.phNo = phNo;
	}
	
	public void contactSave(){
		System.out.println(firstName);
		System.out.println(lastName);
		System.out.println(phNo);
	}
}