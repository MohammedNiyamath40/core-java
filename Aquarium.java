class Aquarium{
public Aquarium(){
this("Marine Reef Tank");
}
public Aquarium(String tankName){
this(75, 48);
System.out.println("Aquarium Name: "+tankName);
}
public Aquarium(int gallons, int lengthInches){
this(20, "Saltwater", 9.7f);
System.out.println("Dimensions: Capacity: "+gallons+" gallons, Length: "+lengthInches+" inches");
}
public Aquarium(int fishCount, String waterType, float filtrationRate){
this("01 Aug 2024", "Protein Skimmer", "LED Lighting", "AQ-222");
System.out.println("Ecosystem: Fish: "+fishCount+", Water: "+waterType+", Filtration: "+filtrationRate);
}
public Aquarium(String setupDate, String equipment1, String equipment2, String aquariumId){
this("Ultra Clear", true, true, "Canister Filter", true);
System.out.println("Setup Details: Date: "+setupDate+", Equip1: "+equipment1+", Equip2: "+equipment2+", ID: "+aquariumId);
}
public Aquarium(String glassType, boolean hasHeater, boolean hasLivePlants, String filterBrand, boolean isCycled){
System.out.println("Appearance: Glass: "+glassType+", Has Heater: "+hasHeater+", Live Plants: "+hasLivePlants+", Filter: "+filterBrand+", Is Cycled: "+isCycled);
}
}
