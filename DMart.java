class DMart{
	public static void main(String[] dmart){
		String[] vegetables = new String[15];
		vegetables[0] = "Tomato";
		vegetables[1] = "Potato";
		vegetables[2] = "Carrot";
		vegetables[3] = "Cabbage";
		vegetables[4] = "Onion";
		vegetables[5] = "Mushroom";
		vegetables[6] = "Pumpkin";
		vegetables[7] = "Broccali";
		vegetables[8] = "Green peas";
		vegetables[9] = "Brinjal";
		vegetables[10] = "Capsicum";
		vegetables[11] = "Cauliflower";
		vegetables[12] = "Garlic";
		vegetables[13] = "Better root";
		vegetables[14] = "Corn4";
		System.out.println(vegetables.length);
		
		String[] fruits = new String[15];
		fruits[0] = "Apple";
		fruits[1] = "Banana";
		fruits[2] = "Mango";
		fruits[3] = "Orange";
		fruits[4] = "Grapes";
		fruits[5] = "Strawberry";
		fruits[6] = "pineapple";
		fruits[7] = "papaya";
		fruits[8] = "watermelon";
		fruits[9] = "kiwi";
		fruits[10] = "guava";
		fruits[11] = "pomogrante";
		fruits[12] = "chery";
		fruits[13] = "pear";
		fruits[14] = "dragon friut";
		System.out.println(fruits.length);
		
		String[] clothsBrand = new String[15];
		clothsBrand[0] = "Louis Vuitton";
		clothsBrand[1] = "H&M";
		clothsBrand[2] = "Hermes";  
		clothsBrand[3] = "Nike";
		clothsBrand[4] = "Zara";
		clothsBrand[5] = "Adidas";
		clothsBrand[6] = "Levi's";
		clothsBrand[7] = "Gucci";
		clothsBrand[8] = "Parada";
		clothsBrand[9] = "Zara-Man";
		clothsBrand[10] = "Uniqlo";
		clothsBrand[11] = "Calvin Klein";
		clothsBrand[12] = "Tommy Hilfiger";
		clothsBrand[13] = "Vero Moda";
		clothsBrand[14] = "Wrangler";
		System.out.println(clothsBrand.length);
		
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
		
		String[] cosmetics = new String[15];
		cosmetics[0] = "Setting Spray";
		cosmetics[1] = "Lip Gloss";
		cosmetics[2] = "Lipstick";
		cosmetics[3]= "Eyebrow Pencil";
		cosmetics[4] = "Mascara";
		cosmetics[5] = "Eyeliner";
		cosmetics[6] = "Eyeshadow Palette";
		cosmetics[7] = "Contour";
		cosmetics[8] = "Highlighter";
		cosmetics[9] = "Contour";
		cosmetics[10] = "Blush";
		cosmetics[11] = "Compact Powder";
		cosmetics[12] = "Foundation";
		cosmetics[13] = "Primer";
		cosmetics[14] = "Moisturizer";
		System.out.println(cosmetics.length);
		
		
		for(String vegetablesName : vegetables){
			System.out.println("ForEach Loop--Vegetables Name: "+ vegetablesName);
		}
		for(String friutsName : fruits){
			System.out.println("ForEach Loop--Fruits Name: "+friutsName);
		}
		for(String cloths : clothsBrand){
			System.out.println("ForEach Loop--Cloths Brand Name: "+cloths);
		}
		for(String groceriesItems : groceries){
			System.out.println("ForEach Loop--Groceries: "+groceriesItems);
		}
		for(String cosmeticsProduct : cosmetics){
			System.out.println("ForEach Loop--Cosmetics: "+cosmeticsProduct);
		}
		
		for(int i = 0; i < vegetables.length; i++){
			System.out.println("For Loop--Vegetables :"+vegetables[i]);
		}
		for(int i = 0; i < fruits.length; i++){
			System.out.println("For Loop--Vegetables :"+fruits[i]);
		}
		for(int i = 0; i < clothsBrand.length; i++){
			System.out.println("For Loop--Vegetables :"+clothsBrand[i]);
		}
		for(int i = 0; i < groceries.length; i++){
			System.out.println("For Loop--Vegetables :"+groceries[i]);
		}
		for(int i = 0; i < cosmetics.length; i++){
			System.out.println("For Loop--Vegetables :"+cosmetics[i]);
		}
	}	
}