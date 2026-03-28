class PanCardRunner{
	public static void main(String[] panCard){
		PanCard person1 = new PanCard();
		System.out.println("************Printing values of person1*************");
		person1.name = "Mohammed Niyamath";
		System.out.println("PERSON1 Name : "+person1.name);
		person1.dob = "29-02-2005";
		System.out.println("PERSON1 DOB : "+person1.dob);
		person1.fatherName = "Mohammed Suban";
		System.out.println("PERSON1 Father Name : "+person1.fatherName);
		
		PanCard person2 = new PanCard();
		System.out.println("************Printing values of person2*************");
		person2.name = "Arziya Banu";
		System.out.println("PERSON2 Name : "+person2.name);
		person2.dob = "31-10-2003";
		System.out.println("PERSON2 DOB : "+person2.dob);
		person2.fatherName = "Mohammed Suban";
		System.out.println("PERSON2 Father Name : "+person2.fatherName);
		
		PanCard person3 = new PanCard();
		System.out.println("************Printing values of person3*************");
		person3.name = "Shafiya Banu";
		System.out.println("PERSON3 Name : "+person3.name);
		person3.dob = "17-07-2000";
		System.out.println("PERSON3 DOB : "+person3.dob);
		person3.fatherName = "Mohammed Suban";
		System.out.println("PERSON3 Father Name : "+person3.fatherName);
		
	}
}