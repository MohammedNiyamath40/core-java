class FavFrits{
	public static void main(String[] fruits){
		System.out.println("Fruits Name:");
		String[] fruitsName = {"Apple","Watermelon","banana","Mango","poomogrante","grapes","muskmelon","dragon Fruit","kiwi"};
		float[] weightInKgPrice = {100.0f,30.00f,60.00f,150.00f,80.00f,40.00f,150.00f,120.00f};
		
		for(String name : fruitsName){
			System.out.println(name);
		}
		System.out.println("Price in terms of KG:");
		for(float price : weightInKgPrice){
			System.out.println(price);
		}
	}
}