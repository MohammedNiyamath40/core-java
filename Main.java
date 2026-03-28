class Main{
	public static void main(String[] args){
		System.out.println(SubClass.topic);
		 SubClass.getDataNames();
		 
		 System.out.println("Ages:");
		 int[] ages = SubClass.getDataAge();
		 for(int datages : ages){
			 System.out.println(datages);
		 }
		 
		
		
	}
}