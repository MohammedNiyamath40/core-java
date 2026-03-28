class ShirtSizes{
	public static void main(String[] shirtSize){
		String[] brandName = {"Crown Prince"};
		String[] sizeInLetters = {"XS","S","M","L","XL","XXL","XXXL"};
		int[] sizeInNumbers = {28,30,32,34,36,38,40,42,44};
		
		System.out.println("Brand Name:"+brandName[0]);
		System.out.println("Size In Letters:");
		for(String letters : sizeInLetters){
			System.out.println(letters);
		}
		System.out.println("Size In Numbers:");
		for(int numbers : sizeInNumbers){
			System.out.println(numbers);
		}
	}
}