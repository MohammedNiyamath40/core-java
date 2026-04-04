class InstagramAccount{
	String fullName;
	String userName;
	String email;
	long phNo;
	String language;
	String password;
	
	public InstagramAccount(String fullName, String userName, String email, long phNo, String language, String password){
		this.fullName = fullName;
		this.userName = userName;
		this.email = email;
		this.phNo = phNo;
		this.language = language;
		this.password = password;
	}
	public void accountCreated(){
		System.out.println(fullName);
		System.out.println(userName);
		System.out.println(email);
		System.out.println(phNo);
		System.out.println(language);
		System.out.println(password);
	}
	int otp;
	public InstagramAccount(String userName, String password, int otp){
		this.userName = userName;
		this.password = password;
		this.otp = otp;
	}
	public void loginPage(){
		System.out.println(userName);
		System.out.println(password);
		System.out.println(otp);
	}
}