class PhonePeTranscation{
	public static void main(String[] transcation){
		String[] moneySendTo = {"Mohammed","Niyamath","user1","user2","user3","user4","user5","user6","user7","user8"};
		int[] moneyPaid = {100,200,300,400,500,600,700,800,900,1000};
		int[] moneyBalance = {1000,900,800,700,600,500,400,300,200,100};
		
		System.out.println("Transcation History Money Send To:");
		for(String user : moneySendTo){
			System.out.println(user);
		}
		System.out.println("How Much Money Have Paid");
		for(int paid : moneyPaid){
			System.out.println(paid);
		}
		System.out.println("Balance Amount:");
		for(int balance : moneyBalance){
			System.out.println(balance);
		}
	}
}