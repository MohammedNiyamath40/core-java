class VishalMart{
	public static void main(String[] vishal){
		String[] clothsCategories = new String[15];
		clothsCategories[0] = "H&M";
		clothsCategories[1] = "Hermes";
		clothsCategories[2] = "Nike";
		clothsCategories[3] = "Zara";
		clothsCategories[4] = "Levi's";
		clothsCategories[5] = "Adidas";
		clothsCategories[6] = "Uniqlo";
		clothsCategories[7] = "Calvin Klein";
		clothsCategories[8] = "Tommy Hilfiger";
		clothsCategories[9] = "Parada";
		clothsCategories[10] = "Vero Moda";
		clothsCategories[11] = "Wrangler";
		clothsCategories[12] = "Louis Vuitton";
		clothsCategories[13] = "Zara-Man";
		clothsCategories[14] = "Gucci";
		System.out.println(clothsCategories.length);
		
		String[] chocolateNames = new String[15];
		chocolateNames[0] = "Ferrero Rocher";
		chocolateNames[1] = "Kit Kat ";
		chocolateNames[2] = "Cadbury Dairy Milk ";
		chocolateNames[3] = "Cadbury 5 Star ";
		chocolateNames[4] = "Kinder Bueno";
		chocolateNames[5] = "Amul Dark Chocolate";
		chocolateNames[6] = "Bounty";
		chocolateNames[7] = "M&M's ";
		chocolateNames[8] = "Toblerone";
		chocolateNames[9] = "Hershey's";
		chocolateNames[10] = "Galaxy";
		chocolateNames[11] = "Milky Way ";
		chocolateNames[12] = "Snickers";
		chocolateNames[13] = "Twix";
		chocolateNames[14] = "Lindt Lindor";
		System.out.println(chocolateNames.length);
		
		String[] riceBrands = new String[15];
		riceBrands[0] = "Maharani";
		riceBrands[1] = "Seeds of Change";
		riceBrands[2] = "Three Ladies";
		riceBrands[3] = "Golden Phoenix ";
		riceBrands[4] = "Tamaki Gold ";
		riceBrands[5] = "Dynasty";
		riceBrands[6] = "Lal Qilla";
		riceBrands[7] = "Nishiki ";
		riceBrands[8] = "Goya";
		riceBrands[9] = "Lundberg Family Farms";
		riceBrands[10] = "Royal Umbrella";
		riceBrands[11] = "Tilda";
		riceBrands[12] = "Kohinoor ";
		riceBrands[13] = "Daawat";
		riceBrands[14] = "India Gate";
		System.out.println(riceBrands.length);
		
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
		
		String[] kitchenApplances = new String[15];
		kitchenApplances[0] = "Chef's Knife";
		kitchenApplances[1] = "Cutting Board";
		kitchenApplances[2] = "Spatula";
		kitchenApplances[3] = "Whisk";
		kitchenApplances[4] = "Mixing Bowls";
		kitchenApplances[5] = "Measuring Cups";
		kitchenApplances[6] = "Tongs";
		kitchenApplances[7] = "Colander";
		kitchenApplances[8] = "Vegetable Peeler";
		kitchenApplances[9] = "Grater";
		kitchenApplances[10] = "Ladle";
		kitchenApplances[11] = "Saucepan";
		kitchenApplances[12] = "Frying Pan";
		kitchenApplances[13] = "Rolling Pin";
		kitchenApplances[14] = "Can Opener";
		System.out.println(kitchenApplances.length);
		
		for(String clothsBrands : clothsCategories){
			System.out.println("ForEach Loop--cloths Brand Name: "+ clothsBrands);
		}
		for(String chocolatesNames : chocolateNames){
			System.out.println("ForEach Loop--Chocolates Name: "+chocolatesNames);
		}
		for(String rice : riceBrands){
			System.out.println("ForEach Loop--Rice Brand Name: "+rice);
		}
		for(String juice : juiceNames){
			System.out.println("ForEach Loop--Juice Names: "+juice);
		}
		for(String kitchenItems : kitchenApplances){
			System.out.println("ForEach Loop--Kitchen Items: "+kitchenItems);
		}
		
		for(int i = 0; i < clothsCategories.length; i++){
			System.out.println("For Loop--Cloths :"+clothsCategories[i]);
		}
		for(int i = 0; i < chocolateNames.length; i++){
			System.out.println("For Loop--Chocolates :"+chocolateNames[i]);
		}
		for(int i = 0; i < riceBrands.length; i++){
			System.out.println("For Loop--Rice :"+riceBrands[i]);
		}
		for(int i = 0; i < juiceNames.length; i++){
			System.out.println("For Loop--Juice :"+juiceNames[i]);
		}
		for(int i = 0; i < kitchenApplances.length; i++){
			System.out.println("For Loop--Kitchen Items :"+kitchenApplances[i]);
		}
	}
}