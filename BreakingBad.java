class BreakingBad{
public static void main(String[] args){
	String[] characters = {"Walter White", "Jesse Pinkman", "Skyler White", "Hank Schrader", "Marie Schrader", "Saul Goodman"};
    System.out.println("Printing Characters Names As Index Number: ");
	for(int i = 0; i<=5; i++ ){
		System.out.println("Characters Name: "+characters[i]);
	}
	System.out.println("---------------------------------------------------");
	int[] releaseYears = {2008, 2009, 2010, 2011, 2012};
	System.out.println("Printing Relese years");
	for(int i = 0; i <= 4; i++){
		System.out.println("Release Years: "+releaseYears[i]);
	}
	System.out.println("---------------------------------------------------");
	String[] villains = {"Tuco Salamanca", "Gustavo Fring", "Hector Salamanca", "Todd Alquist", "Jack Welker"};
	System.out.println("Printing Villains Names");
	for(int i = 0; i <= 4; i++){
		System.out.println("Villans Names: "+villains[i]);
	}
	System.out.println("---------------------------------------------------");
	float[] topEpisodeRatings = {10.0f, 9.9f, 9.9f, 9.7f};
	System.out.println("Printing Ratings As Per Index Numbers");
	for(int i = 0; i<= 3; i++){
		System.out.println("Top Rating: "+topEpisodeRatings[i]);
	}
}
}