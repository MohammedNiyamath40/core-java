class CustomerDetails{
	public static void main(String[] args){
		System.out.println("Customer Details:");
		
		String[] customerNames = {"user1","user2","user3","user4","user5","user6","user7","user8","user9","user10"};
		long[] customerNumber = {7975106965l,1234567890l,2345678901l,3456789012l,4567890123l,5678901234l,6789012345l,7890123456l,7890123456l,8901234567l};
		int[] customerAge = {20,21,22,23,24,25,26,27,28,29};
		
		System.out.println("Customer Name:");
		for(String names : customerNames){
			System.out.println(names);
		}
		System.out.println("Customer Numbers:");
		for(long numbers : customerNumber){
			System.out.println(numbers);
		}
		System.out.println("Customer Age:");
		for(int age : customerAge){
			System.out.println(age);
		}
	}
}