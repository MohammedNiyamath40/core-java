class StudentGrade{
	static String checkgrade(String name, int score){
		String passed = "Student Passed";
		System.out.println("Checking the score for "+name);
		
		if(score >= 60){
			System.out.println("Yes the person PASSED. Name: "+name);
			System.out.println("Score: "+score);
			return passed;
		}
		else{
			System.out.println("No the person FAILED. Name: "+name);
			System.out.println("Score :"+score);
			return "Student Failed";
		}
	}
}