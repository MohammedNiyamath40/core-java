class BigBazzar{
	public static void main(String[] bigBazzar){
		String[] juiceNames = new String[15];
		juiceNames[0] = "Lemon-Ginger";
		juiceNames[1] = "Mango Juice";
		juiceNames[2] = "Beetroot Juice ";
		juiceNames[3] = "Celery Juice";
		juiceNames[4] = "Green Juice";
		juiceNames[5] = "Tomato Juice";
		juiceNames[6] = "Grapefruit Juice ";
		juiceNames[7] = "Watermelon Juice";
		juiceNames[8] = "Carrot Juice";
		juiceNames[9] = "Pomegranate Juice";
		juiceNames[10] = "Cranberry Juice";
		juiceNames[11] = "Grape Juice";
		juiceNames[12] = "Pineapple Juice";
		juiceNames[13] = "Apple Juice ";
		juiceNames[14] = "Orange Juice";
		System.out.println(juiceNames.length);
		
		String[] coldDrinksName = new String[15];
		coldDrinksName[0] = "Coca-Cola";
		coldDrinksName[1] = "Pepsi";
		coldDrinksName[2] = "Sprite ";
		coldDrinksName[3] = "Fanta";
		coldDrinksName[4] = "Thums Up";
		coldDrinksName[5] = "Limca";
		coldDrinksName[6] = "Appy Fizz ";
		coldDrinksName[7] = "Frooti";
		coldDrinksName[8] = "Maaza";
		coldDrinksName[9] = "Mountain Dew";
		coldDrinksName[10] = "Dr Pepper";
		coldDrinksName[11] = "7 Up";
		coldDrinksName[12] = "Sting Energy";
		coldDrinksName[13] = "Red Bull ";
		coldDrinksName[14] = "Schweppes Ginger";
		System.out.println(coldDrinksName.length);
		
		String[] groceries = new String[15];
		groceries[0] = "Rice";
		groceries[1] = "Wheat Flour";
		groceries[2] = "Lentils";
		groceries[3] = "Cooking Oil";
		groceries[4] = "Onions";
		groceries[5] = "Garlic";
		groceries[6] = "Tea Leaves";
		groceries[7] = "Turmeric Powder";
		groceries[8] = "Bread";
		groceries[9] = "Eggs";
		groceries[10] = "Milk";
		groceries[11] = "Sugar";
		groceries[12] = "Salt";
		groceries[13] = "Potatoes";
		groceries[14] = "Tomatoes";
		System.out.println(groceries.length); 
		
		String[] kitchenNeeds = new String[15];
		kitchenNeeds[0] = "Chef's Knife";
		kitchenNeeds[1] = "Cutting Board";
		kitchenNeeds[2] = "Spatula";
		kitchenNeeds[3] = "Whisk";
		kitchenNeeds[4] = "Mixing Bowls";
		kitchenNeeds[5] = "Measuring Cups";
		kitchenNeeds[6] = "Tongs";
		kitchenNeeds[7] = "Colander";
		kitchenNeeds[8] = "Vegetable Peeler";
		kitchenNeeds[9] = "Grater";
		kitchenNeeds[10] = "Ladle";
		kitchenNeeds[11] = "Saucepan";
		kitchenNeeds[12] = "Frying Pan";
		kitchenNeeds[13] = "Rolling Pin";
		kitchenNeeds[14] = "Can Opener";
		System.out.println(kitchenNeeds.length);
		
		String[] dryFruits = new String[15];
		dryFruits[0] = "Dried Cranberries";
		dryFruits[1] = "Pine Nuts";
		dryFruits[2] = "Peanuts";
		dryFruits[3] = "Brazil Nuts";
		dryFruits[4] = "Fox Nuts";
		dryFruits[5] = "Hazelnuts";
		dryFruits[6] = "Prunes";
		dryFruits[7] = "Dates ";
		dryFruits[8] = "Dried Figs";
		dryFruits[9] = "Dried Apricots ";
		dryFruits[10] = "Raisins";
		dryFruits[11] = "Pistachio";
		dryFruits[12] = "Walnut ";
		dryFruits[13] = "Cashew Nut";
		dryFruits[14] = "Almond";
		System.out.println(dryFruits.length);
		
		for(String juice : juiceNames){
			System.out.println("ForEach Loop--Juice Names: "+juice);
		}
		for(String coldDrink : coldDrinksName){
			System.out.println("ForEach Loop--Cold Drinks Names: "+coldDrink);
		}
		for(String groceriesItems : groceries){
			System.out.println("ForEach Loop--Groceries: "+groceriesItems);
		}
		for(String kitchenItems : kitchenNeeds){
			System.out.println("ForEach Loop--Kitchen Items: "+kitchenItems);
		}
		for(String dryFruit : dryFruits){
			System.out.println("ForEach Loop--Dry Friuts Names: "+dryFruits);
		}
		
		for(int i = 0; i < juiceNames.length; i++){
			System.out.println("For Loop--Juice :"+juiceNames[i]);
		}
		for(int i = 0; i < coldDrinksName.length; i++){
			System.out.println("For Loop--Cold Drink :"+coldDrinksName[i]);
		} 
		for(int i = 0; i < groceries.length; i++){
			System.out.println("For Loop--Vegetables :"+groceries[i]);
		}
		for(int i = 0; i < kitchenNeeds.length; i++){
			System.out.println("For Loop--Kitchen Items :"+kitchenNeeds[i]);
		}
		for(int i = 0; i < dryFruits.length; i++){
			System.out.println("For Loop--Dry Fruits Names :"+dryFruits[i]);
		}

	}
}