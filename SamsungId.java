class SamsungId{
	String newName;
	String email;
	long phNo;
	String dob;
	String password;
	
	public SamsungId(String newName, String email, long phNo, String dob, String password){
		this.newName = newName;
		this.email = email;
		this.phNo = phNo;
		this.dob = dob;
		this.password = password;
	}
	public void creatingAccount(){
		System.out.println(newName);
		System.out.println(email);
		System.out.println(phNo);
		System.out.println(dob);
		System.out.println(password);
	}
	
	public SamsungId(String email, String password){
		this.email = email;
		this.password = password;
	}
	public void login(){
		System.out.println(email);
		System.out.println(password);
	}
}