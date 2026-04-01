class AppleId{
	String name;
	String email;
	long phNo;
	String appleId;
	
	public AppleId(String name, String email, long phNo, String appleId){
		this.name = name;
		this.email = email;
		this.phNo = phNo;
		this.appleId = appleId;
	}
	public void createId(){
		System.out.println(name);
		System.out.println(email);
		System.out.println(phNo);
		System.out.println(appleId);
	}
}