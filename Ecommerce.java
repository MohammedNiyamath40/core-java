class Ecommerce{
	Ecommerce(String customerName, String customerEmail, long phNo, int noOfOrders, int totalAmount){
	System.out.println("Bill details: Customer Name: "+ customerName+ " Customer EmailId: "+customerEmail+ ", Customer Phone Number: "+phNo+ ", Number of orders:"+noOfOrders+ ", Total Amount: "+totalAmount);	
	}
	Ecommerce(int sizeOfShoes, int priceOfShoes, String colorofShoes, String brandName){
		this("Mohammed", "niyamath123@gmail.com", 7975106965l , 10, 30000);
		System.out.println("Details of shoe: "+ sizeOfShoes+ " is Size, "+priceOfShoes+ " is the price then color is "+colorofShoes+" and the brand Name is "+brandName);
	}
	Ecommerce(char size, int price, String color){
		this(44, 4500, "White", "Puma");
		System.out.println("Details of cloth: "+ size + " is Size, then "+ price +" is the price and Shirt color is "+ color+ ".") ;
		
	}
	Ecommerce(String product1, String product2){
		this('L', 2000, "Black");
		System.out.println("Products : "+ product1 +" and "+ product2);
	}
	Ecommerce(String fullName){
		this("Cloths","Shoes");
		System.out.println("Website Name: "+fullName);		
	}
	Ecommerce(){
		this("ShopEase");
	}
}