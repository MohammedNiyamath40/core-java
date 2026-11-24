class  TheFamilyMan{
	public static void main(String[] args){
		String[] missionLocations = {"Mumbai", "Srinagar", "Delhi", "Chennai", "Kohima", "Moreh"};
		for(int i = 0; i <= 5; i++){
			System.out.println("Mission Locations Cities: "+missionLocations[i]);
		}
		System.out.println("--------------------------------------------------------");
		short[] familyManReleaseYears = {2019, 2021, 2025};
		for(int i = 0; i <= 2; i++){
			System.out.println("Release Years Based On Seasons: "+familyManReleaseYears[i]);
		}
		System.out.println("--------------------------------------------------------");
		double[] topMissionRatings = {9.4, 9.2, 8.9, 8.8};
		for(int i = 0; i <= 3; i++){
			System.out.println("Top Mission ratings: "+topMissionRatings[i]);
		}
		System.out.println("--------------------------------------------------------");
		String[] familyManAntagonists = {"Moosa Rahman", "Major Sameer", "Sajid", "Raji", "Subbu", "Rukma"};
		for(int i = 0; i <= 5; i++){
			System.out.println("Key Antagonists: "+familyManAntagonists[i]);
		}
	}
}