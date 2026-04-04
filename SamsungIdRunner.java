class SamsungIdRunner{
	public static void main(String[] samsungId){
		SamsungId creatingId = new SamsungId("Mohammed Niyamath", "mohammedniyamath920@gmail.com", 7975106965l, "07-05-2005", "Niyamath@123");
		creatingId.creatingAccount();
		SamsungId loginId = new SamsungId("mohammedniyamath920@gmail", "Niyamath@123");
		loginId.login();
	}
}