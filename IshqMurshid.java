class IshqMurshid{
	public static void main(String[] args){
		String[] murshidCharacters = {"Shahmir Sikandar / Fazal Bakhsh", "Shibra Suleman", "Dawood Ali Khan", "Suleman Ahmad", "Safia Suleman", "Sukaina Suleman", "Faraz Aftab", "Mehreen Baig"};
		System.out.println("Printing Characters Names As Per Index Values:");
		for(int i = 0; i <= 7; i++){
			System.out.println("Characters Name: "+murshidCharacters[i]);
		}
		System.out.println("--------------------------------------------------------");
		boolean[] isShibraFamily = {false, true, false, true, true, true, false, false};
		System.out.println("Printing Shibra Family Present As Per Index Values:");
		for(int i = 0; i <= 7; i++){
			System.out.println("T/F Shibra's Family Members??: "+isShibraFamily[i]);
		}
		System.out.println("--------------------------------------------------------");
		String[] filmingCities = {"Karachi", "Lahore", "Islamabad"};
		System.out.println("Printing Locations Names As Per Index Values:");
		for(int i = 0; i <= 2; i++){
			System.out.println("Locations Names: "+filmingCities[i]);
		}
		System.out.println("--------------------------------------------------------");
		String[] murshidActors = {"Bilal Abbas Khan", "Durefishan Saleem", "Omair Rana", "Noor ul Hassan", "Salma Hassan", "Hafsa Ehsan Abbasi", "Awais Sulaman", "Hira Tareen"};
		System.out.println("Printing Original Names of the Characters As per Index Values:");
		for(int i = 0; i <= 7; i++){
			System.out.println("Characters Original Name: "+murshidActors[i]);
		}
	}
}