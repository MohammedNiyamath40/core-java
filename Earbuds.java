class Earbuds{
	static String brand = "OnePlus Nord Buds 3r";
	static float ratings = 4.2f;
	static int latency = 47;
	static double price = 1799.00;
	
	
	
static String getBrand(){
	return brand;
}
static String getRatings(){
	return ratings;
}
static String getLatency(){
	System.out.println(latency+ "ms");
	return latency;
}

}