class BikeOrders{
	String bikeName;
	String customerName;
	int price;
	
	public BikeOrders(String bikeName, String customerName, int price){
		this.bikeName = bikeName;
		this.customerName = customerName;
		this.price = price;
	}
	public void details(){
		System.out.println(bikeName);
		System.out.println(customerName);
		System.out.println(price);
	}
}