class Snapchat{
	public static void main(String[] args){
		String[] userName = {"niyamath1089","user123","user456","user7890","user1234","user5678","user09876","user9123","user767343","user877887"};
		int[] snapStreaks = {10,20,30,40,50,60,70,80,90,100};
		int[] snapScore = {10000,20000,30000,40000,50000,60000,70000,80000,90000,99999};
		
		for(String name : userName){
			System.out.println(name);
		}
		for(int streaks : snapStreaks){
			System.out.println(streaks);
		}
		for(int score : snapScore){
			System.out.println(score);
		}	
	}
}