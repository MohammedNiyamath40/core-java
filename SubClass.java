class SubClass{
	
	static String topic = ("Data Entry:");
	static String[] dataNames = {"user1","user2","user3"}; 
	static int[] dataAge = {20,21,22};
	
	static void getDataNames(){
		System.out.println("Names:");
		for(String names : dataNames){
			System.out.println(names);
		}
		
	}
	static int[] getDataAge(){
		return dataAge;
		
	}
}