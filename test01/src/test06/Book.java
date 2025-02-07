package test06;

public class Book {
	String title;
	String author;
	String pub;
	int page;
	
	public Book() {}
	public Book(String title, String author, String pub, int page) {
		this.title = title;
		this.author = author;
		this.pub = pub;
		this.page = page;
	}
	public void display() {
		System.out.printf("%s, %s, %s, %d %n", title,author,pub,page);
		// TODO Auto-generated method stub

	}

}
