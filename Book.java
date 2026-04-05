class Book{
	public Book(){
		this("Thanks For Leaving Me.");
	}
	public Book(String bookName){
		this(180, "Mohammed Niyamath");
		System.out.println("Book Name: "+bookName);
	}
	public Book(int pages, String authorName){
		System.out.println("Number of pages: "+pages+ ", Author Name: "+authorName);
	}
}