class PassPort{
	static String validationCheck(String name, int age){
		String valid = (name+" has 10 Years Of validation");
		
		if(18 <= age){
			System.out.println(name+" is now "+age+ " years old.");
			return valid ;
		}
		else{
			System.out.println(name+" is under age because "+name+ " is "+age+ "years old.");
			return "This Person is under age so it have 5 years of validation ";
		}
	}
}