class BetterCallSaul{
	public static void main(String[] args){
		String[] saulCharacters = {"Jimmy McGill", "Kim Wexler", "Mike Ehrmantraut", "Nacho Varga", "Howard Hamlin", "Chuck McGill", "Lalo Salamanca"};
		System.out.println("Printing Character Names As Per Index Values:");
		for(int i = 0; i <= 6; i++){
			System.out.println("Characters Names: "+saulCharacters[i]);
		}
		System.out.println("-----------------------------------------------------");
		int[] saulSeasonEpisodes = {10, 10, 10, 10, 10, 13};
		System.out.println("Printing Episodes As Per Index Values:");
		for(int i = 0; i <= 5; i++){
			System.out.println("Episodes Numbers Per Seasons: "+saulSeasonEpisodes[i]);
		}
		System.out.println("-----------------------------------------------------");
		double[] seasonImdbScores = {8.4, 8.6, 8.8, 8.9, 9.2, 9.4};
		System.out.println("Printing IMDB Ratings As Per Index Values:");
		for(int i = 0; i <= 5; i++){
			System.out.println("Ratings Per Season: "+seasonImdbScores[i]);   
		}
		System.out.println("-----------------------------------------------------");
		boolean[] appearedInBreakingBad = {true, false, true, false, false, false, false};
		System.out.println("Printing Characters Appeared in Breaking Bad As Per Index Values:");
		for(int i = 0; i <= 6; i++){
			System.out.println("Appearded In Breaking Bad: "+appearedInBreakingBad[i]);   
		}
	}
}