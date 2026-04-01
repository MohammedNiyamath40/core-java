class GoogleRunner{
	public static void main(String[] google){
		Google user1 = new Google("Mohammed","Niyamath",7975106965l,"07-07-2005","mohammedniyamath40@gmail.com");
		user1.details();
		Google user2 = new Google("QWERTY","QWERTY",123456789l,"05-07-2000","qwerty_002");
		user2.details();
		Google user3 = new Google("AAAAA","BBBBB",2345678l,"01-12-1000","ababab_003");
		user3.details();
		Google user4 = new Google("CCCCC","DDDDD",345678901l,"11-11-1111","cdcdcd_004");
		user4.details();
		Google user5 = new Google("EEEEE","FFFFF",3456789012l,"12-12-2000","efefef_005");
		user5.details();
		Google user6 = new Google("GGGGG","HHHHH",5678901234l,"08-12-2001","ghghgh_006");
		user6.details();
		Google user7 = new Google("IIIII","JJJJJ",678901234l,"09-12-2002","ijijij_007");
		user7.details();
	}
}