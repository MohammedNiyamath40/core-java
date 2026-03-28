class ChatGpt{
	public static void main(String [] args){
		
	startingMessage();
	System.out.println("Tell me About Methods in Java");
	methodInJava();
	System.out.println("Ok, then Subtract the given values for the followings:");
	int valueOne = 12;
	int valueTwo = 34;
	toSubtractValues(valueOne, valueTwo);
	System.out.println("What's the Price of Gold Today??");
	int goldprice = priceOfGold ();
	System.out.println(goldprice);
	}
	static void startingMessage(){
		System.out.println("Hello Mohammed What can I help You...");
	}
	static void methodInJava(){
		System.out.println("So, About Methods in Java....");
		System.out.println("The Best Site Is");
		System.out.println("Go to google and search 'Java Oracle Methods' you can get all the inforamation about methods");
	}
	static void toSubtractValues(int valueOne, int valueTwo){
		int totalvalue = valueOne - valueTwo ;
	    System.out.println("Ok, So the total value of the following values is "+totalvalue);	
    }
	static int priceOfGold(){
		System.out.println("The price of the gold is");
		int price = 14500;
		return price;
		
	}
}