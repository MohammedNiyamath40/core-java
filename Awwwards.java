class Awwwards{
	String username;
	String email;
	String password;
	
	public Awwwards(String username, String email, String password){
		this.username = username;
		this.email = email;
		this.password = password;
	}
	public void signUp(){
		System.out.println(username);
		System.out.println(email);
		System.out.println(password);
	}
}