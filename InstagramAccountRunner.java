class InstagramAccountRunner{
	public static void main(String[] instagramAccount){
		System.out.println("Creating new Account.");
		InstagramAccount accountCreating = new InstagramAccount("Mohammed Niyamath", "niyamath_142", "mohammedniyamath40@gmail.com",7975106965l,"English","Niyamath@123");
		accountCreating.accountCreated();
		System.out.println("New Account Created.");
		System.out.println("Need to login.");
		InstagramAccount loginId = new InstagramAccount("niyamath_142","Niyamath@123",1234);
		loginId.loginPage();
		System.out.println("Login completed Successfully.");
	}
}