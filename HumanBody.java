class HumanBody{
	public HumanBody(){
		this(206);
	}
	public HumanBody(int bones){
		this("Pair of Hands", "Pair of Legs");
		System.out.println("The Human Consist of "+bones+" bones.");
	}
	public HumanBody(String hands, String legs){
		this("Mouth", "Eyes", "Ears");
		System.out.println("Human Body Consist of "+hands+ " and "+legs);
	}
	public HumanBody(String headMouth, String faceEyes, String faceEars){
		this("Heart", "Kidney", "Lungs", "Stomach");
		System.out.println("Human Head Part Consist of "+headMouth+ " and "+faceEyes+" and "+faceEars);
	}
	public HumanBody(String heart, String kidney, String lungs, String stomach){
		this("Hairs", "Nails", "Cheast", "Fingers", "Nose");
		System.out.println("The human internal consist of mainly "+heart+", "+kidney+", "+lungs+", "+stomach+".");
	}
	public HumanBody(String hairs, String nails, String cheast, String fingers, String nose){
	System.out.println(hairs+", "+nails+", "+cheast+", "+fingers+", "+nose);
	}
}