class GmailRunner{
	public static void main(String[] gmail){
		Gmail creating = new Gmail("Mohammed Niyamath", "niyamath123@gmail.com",7975106965l, "Niyamath@123");
		creating.createGmail();
		Gmail loginPage = new Gmail("niyamath123@gmail", "Niyamath@123");
		loginPage.login();
	}
}