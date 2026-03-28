class MobileDetails{
	public static void main(String[] mobile){
		String[] brandName = {"Samsung","Iphone","Nothing","Oppo","Vivo","Redmi","Huwai","BlackBerry","Nokia","Sony"};
		double[] modelPrice = {1000000.00,100002.00,100003.00,100004.00,100005.00,100006.00,100007.00,100008.00,100009.00,1000001.00};
		int[] yearOfManufacturing = {2001,2002,2003,2004,2005,2006,2007,2008,2009,2010};
		
		System.out.println("Mobile Brand Names:");
		for(String names : brandName){
			System.out.println(names);
		}
		System.out.println("Price of the mobile:");
		for(double price : modelPrice){
			System.out.println(price);
		}
		System.out.println("Manufacture Year:");
		for(int year : yearOfManufacturing){
			System.out.println(year);
		}
	}
}