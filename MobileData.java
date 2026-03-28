class MobileData{
	static String checkDataLimit(String userName, int dataUsage){
		String alert = "Data Limited Reached";
		
		if(dataUsedGb >= 50){
			System.out.println("Warning");
			return alert;
		}
		else{
			System.out.println("Data Used Within Limits");
			return "Usage is Normal";
		}
	}
}