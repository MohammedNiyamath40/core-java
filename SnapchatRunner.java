class SnapchatRunner{
	public static void main(String[] snapchat){
		Snapchat user1 = new Snapchat("Mohammed Niyamath", "mohammedniyamath40@gmail.com",7975106965l,"07-05-2005","niyamath1089");
		user1.details();
		Snapchat user2 = new Snapchat("Mohammed", "mohammed40@gmail.com",7975106965l,"07-05-2005","mohammed1089");
		user2.details();
		Snapchat user3 = new Snapchat("QWERTY", "qwerty40@gmail.com",12345678l,"01-01-1001","qwerty1089");
		user3.details();
	}
}