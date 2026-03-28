class CustomerFeedback{
	public static void main(String[] args){
		String[] customerNames = {"Mohammed","Niyamath","user1","user2","user3","user4","user5","user6","user7","user8"};
		String[] feedback = {"Good","Exellent","Nice","Wonderful","High Qualilty","Good","Not Bad","Worthful","Very Bad","Nice"};
		int[] ratings = {9,10,8,7,6,9,6,7,8,2}; 
		
		System.out.println("Names of the customer");
		for(String name : customerNames){
			System.out.println(name);
		}
		System.out.println("FeedBack: ");
		for(String feedbacks : feedback){
			System.out.println(feedbacks);
		}
		System.out.println("Rating in terms(10/?):");
		for(int rating : ratings){
			System.out.println(rating);
		}
	}
}