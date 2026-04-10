class Trends{
	public static void main(String[] trends){
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
		
		String[] womensClothBrand = new String[15];
		womensClothBrand[0] = "BIBA";
		womensClothBrand[1] = "Fabindia ";
		womensClothBrand[2] = "H&M ";
		womensClothBrand[3] = "Zara ";
		womensClothBrand[4] = "W for Woman";
		womensClothBrand[5] = "Levi's";
		womensClothBrand[6] = "Vero Moda";
		womensClothBrand[7] = "Only ";
		womensClothBrand[8] = "Global Desi";
		womensClothBrand[9] = "Allen Solly";
		womensClothBrand[10] = "Van Heusen";
		womensClothBrand[11] = "Aurelia ";
		womensClothBrand[12] = "Ritu Kumar";
		womensClothBrand[13] = "Marks & Spencer";
		womensClothBrand[14] = "Forever 21";
		System.out.println(womensClothBrand.length);
		
		String[] mensClothBrand = new String[15];
		mensClothBrand[0] = "HRX";
		mensClothBrand[1] = "Mufti";
		mensClothBrand[2] = "Wrogn";
		mensClothBrand[3] = "Arrow";
		mensClothBrand[4] = "Pepe Jeans ";
		mensClothBrand[5] = "Zara Men";
		mensClothBrand[6] = "Tommy Hilfiger";
		mensClothBrand[7] = "Calvin Klein ";
		mensClothBrand[8] = "Canali";
		mensClothBrand[9] = "Brioni";
		mensClothBrand[10] = "Levi's";
		mensClothBrand[11] = "Ralph Lauren";
		mensClothBrand[12] = "Hugo Boss ";
		mensClothBrand[13] = "Armani";
		mensClothBrand[14] = " Gucci";
		System.out.println(mensClothBrand.length);
		
		String[] starbucksCoffee = new String[15];
		starbucksCoffee[0] = "Caramel Macchiato";
		starbucksCoffee[1] = "Dark Chocolate Mocha";
		starbucksCoffee[2] = "Blonde Vanilla Latte ";
		starbucksCoffee[3] = "Caffè Americano";
		starbucksCoffee[4] = "Cappuccino";
		starbucksCoffee[5] = "White Chocolate Mocha";
		starbucksCoffee[6] = "Cold Brew Coffee ";
		starbucksCoffee[7] = "Vanilla Sweet Cream Cold Brew";
		starbucksCoffee[8] = "Caramel Frappuccino";
		starbucksCoffee[9] = "Java Chip Frappuccino";
		starbucksCoffee[10] = "Caffè Latte";
		starbucksCoffee[11] = "Pumpkin Spice Latte";
		starbucksCoffee[12] = "Mocha Frappuccino";
		starbucksCoffee[13] = "Apple Juice ";
		starbucksCoffee[14] = "Flat White";
		System.out.println(starbucksCoffee.length);
		
		String[] refregiratorNames = new String[15];
		refregiratorNames[0] = "LG";
		refregiratorNames[1] = "Samsung";
		refregiratorNames[2] = "Whirlpool";
		refregiratorNames[3] = "Haier";
		refregiratorNames[4] = "Godrej";
		refregiratorNames[5] = "Bosch";
		refregiratorNames[6] = "Panasonic";
		refregiratorNames[7] = "Hitachi";
		refregiratorNames[8] = "Electrolux";
		refregiratorNames[9] = "Voltas Beko";
		refregiratorNames[10] = "Croma";
		refregiratorNames[11] = "Lloyd";
		refregiratorNames[12] = "Liebherr";
		refregiratorNames[13] = "IFB";
		refregiratorNames[14] = "Hisense";
		System.out.println(refregiratorNames.length);
		
		for(String cosmeticsProduct : cosmetics){
			System.out.println("ForEach Loop--Cosmetics: "+cosmeticsProduct);
		}
		for(String chocolatesNames : womensClothBrand){
			System.out.println("ForEach Loop--Women's Cloths Brand : "+chocolatesNames);
		}
		for(String rice : mensClothBrand){
			System.out.println("ForEach Loop--Men's Cloth Brand : "+rice);
		}
		for(String juice : starbucksCoffee){
			System.out.println("ForEach Loop--StarBucks Coffee: "+juice);
		}
		for(String kitchenItems : refregiratorNames){
			System.out.println("ForEach Loop--Refregirator Names: "+kitchenItems);
		}
		
		for(int i = 0; i < cosmetics.length; i++){
			System.out.println("For Loop--Cosemetics :"+cosmetics[i]);
		}
		for(int i = 0; i < womensClothBrand.length; i++){
			System.out.println("For Loop--Women's Cloths Brand :"+womensClothBrand[i]);
		}
		for(int i = 0; i < mensClothBrand.length; i++){
			System.out.println("For Loop--Men's Cloth Brand :"+mensClothBrand[i]);
		}
		for(int i = 0; i < starbucksCoffee.length; i++){
			System.out.println("For Loop--StarBucks Coffee :"+starbucksCoffee[i]);
		}
		for(int i = 0; i < refregiratorNames.length; i++){
			System.out.println("For Loop--Regregirator Names :"+refregiratorNames[i]);
		}
	}
}