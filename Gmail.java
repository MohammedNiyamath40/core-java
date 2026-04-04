class Gmail{
 String fullName;
 String userName;
 long phoneNumber;
 String password;
 public Gmail(String fullName, String userName, long phoneNumber, String password){
	 this.fullName = fullName;
	 this.userName = userName;
	 this.phoneNumber = phoneNumber;
	 this.password = password;
 }
 public void createGmail(){
	 System.out.println(fullName);
	 System.out.println(userName);
	 System.out.println(phoneNumber);
	 System.out.println(password);
 }
 public Gmail(String userName, String password){
	 this.userName = userName;
	 this.password = password;
 }
 public void login(){
	 System.out.println(userName);
	 System.out.println(password);
 }
}