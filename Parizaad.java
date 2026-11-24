class Parizaad{
	public static void main(String[] args){
		String[] parizaadCharacters = {"Parizaad", "Annie", "Naheed", "Bubbly Badmash (Dilawar)", "Behroze Karim", "Laila Saba", "Guru", "Saeeda"};
		System.out.println("Printing Characters Names At Index Values:");
		for(int i = 0; i <= 7; i++){
			System.out.println("Characters Names: "+parizaadCharacters[i]);
		}
		System.out.println("---------------------------------------------------------");
		String[] parizaadActors = {"Ahmed Ali Akbar", "Yumna Zaidi", "Ushna Shah", "Saboor Aly", "Nauman Ijaz", "Urwa Hocane", "Asghar Ali", "Kiran Tabeir"};
		System.out.println("Printing Characters Original Names At Index Values:");
		for(int i = 0; i <= 7; i++){
			System.out.println("Characters Original Names: "+parizaadActors[i]);
		}
		System.out.println("---------------------------------------------------------");
		String[] storyLocations = {"Lahore", "Karachi", "Islamabad", "Murree"};
		System.out.println("Printing Locations Places Names At Index Values:");
		for(int i = 0; i <= 3; i++){
			System.out.println("Locations Places Names: "+storyLocations[i]);
		}
		System.out.println("---------------------------------------------------------");
		double[] episodeDurations = {38.5, 40.0, 42.5, 45.0, 52.0};
		System.out.println("Printing Duration Episode Lengths in Minutes At Index Values:");
		for(int i = 0; i <= 4; i++){
			System.out.println("Duration Lengths in Minutes: "+episodeDurations[i]);
		}
	}
}