class SmartWatch{
public SmartWatch(){
this("Apple Watch Ultra 2");
}
public SmartWatch(String modelName){
this(49, 64);
System.out.println("Watch Model: "+modelName);
}
public SmartWatch(int screenMM, int storageGB){
this(5, "watchOS", 9.3f);
System.out.println("Specs: Screen: "+screenMM+" mm, Storage: "+storageGB+" GB");
}
public SmartWatch(int sensors, String os, float durabilityRating){
this("15 Dec 2024", "GPS", "Heart Rate Monitor", "SW-555");
System.out.println("Features: Sensors: "+sensors+", OS: "+os+", Durability: "+durabilityRating);
}
public SmartWatch(String purchaseDate, String sensor1, String sensor2, String watchId){
this("Titanium Orange", true, true, "Li-Ion", true);
System.out.println("Purchase Info: Date: "+purchaseDate+", Sensor1: "+sensor1+", Sensor2: "+sensor2+", Watch ID: "+watchId);
}
public SmartWatch(String strapColor, boolean isWaterResistant, boolean hasCellular, String batteryType, boolean hasECG){
System.out.println("Appearance: Strap Color: "+strapColor+", Is Water Resistant: "+isWaterResistant+", Has Cellular: "+hasCellular+", Battery: "+batteryType+", Has ECG: "+hasECG);
}
}
