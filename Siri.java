class Siri{
	public static void main(String [] args){
		System.out.println("Hi Siri");
		getSiri();
		System.out.println("Heyy Siri Call MOM");
		long contactNumber = 9876543210L;
		String sendMessage = "Pick UP Call Its Emergency";
		addCall(contactNumber,sendMessage);

		
	}
	
	static void getSiri(){
	System.out.println("Hello... Am Siri");
	}
	
	static void addCall(long contactNumber,String sendMessage){
		System.out.println("Yes Sir Am Calling Your MOM");
		System.out.println(contactNumber);
		System.out.println(sendMessage);
	}
	
}