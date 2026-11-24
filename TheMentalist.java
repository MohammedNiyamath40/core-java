class TheMentalist{
	public static void main(String[] args){
		String[] characterNames = {"Patrick Jane", "Teresa Lisbon", "Kimball Cho", "Wayne Rigsby", "Grace Van Pelt", "Dennis Abbott", "Kim Fischer", "Jason Wylie", "Michelle Vega"};
		System.out.println("Printing Characters Names As Their Characters:");
		for(int i = 0; i<=8 ; i++){
			System.out.println("Characters As Per Index Number: "+characterNames[i]);
		}
		System.out.println("---------------------------------------------------");
		
		String[] salary = {"47,050,000", "16,310,000", "10,750,000", "8,050,000", "7,750,000", "Not disclosed", "Not disclosed", "Not disclosed", "Not disclosed"};
		System.out.println("Printing Characters Total Salary:");
		for(int i = 0; i<=8 ; i++){
			System.out.println("Salary As Per Index Number: $"+salary[i]);
		}
		System.out.println("---------------------------------------------------");
		
		double[] ratings = {8.1, 8.2, 8.3, 8.2, 8.1, 8.3, 8.2};
		System.out.println("Printing IBDM Ratings:");
		for(int i = 0; i<=6 ; i++){
			System.out.println("Ratings As Per Index Number: "+ratings[i]);
		}
		System.out.println("---------------------------------------------------");
		
		boolean[] survivedFinal = {true, true, true, true, true, false, false, false, false};
		System.out.println("Printing the Characters Which Survied Till Final");
		for(int i = 0; i<=8 ; i++){
			System.out.println("Survived Character As Per Index Number: "+survivedFinal[i]);
		}		
	}
}