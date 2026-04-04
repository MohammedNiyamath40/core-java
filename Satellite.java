class Satellite{
public Satellite(){
this("Hubble Space Telescope");
}
public Satellite(String satName){
this(11110, 1990);
System.out.println("Satellite Name: "+satName);
}
public Satellite(int orbitAltKm, int launchYear){
this(2, "Observatory", 9.9f);
System.out.println("Orbit: Altitude: "+orbitAltKm+" km, Launched: "+launchYear);
}
public Satellite(int solarArrays, String missionType, float successRate){
this("24 Apr 1990", "High-Res Camera", "Gyroscope", "SAT-333");
System.out.println("Tech Specs: Solar Arrays: "+solarArrays+", Mission: "+missionType+", Success: "+successRate);
}
public Satellite(String deployDate, String instrument1, String instrument2, String satId){
this("Metallic Silver", true, true, "Xenon Thrusters", true);
System.out.println("Deployment: Date: "+deployDate+", Instr1: "+instrument1+", Instr2: "+instrument2+", ID: "+satId);
}
public Satellite(String exteriorFinish, boolean hasAntenna, boolean hasSolarSails, String propulsionType, boolean isActive){
System.out.println("Appearance: Finish: "+exteriorFinish+", Has Antenna: "+hasAntenna+", Solar Sails: "+hasSolarSails+", Propulsion: "+propulsionType+", Is Active: "+isActive);
}
}
