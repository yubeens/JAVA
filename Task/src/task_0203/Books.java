package task_0203;

public class Books {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("제목"+"\t\t"+"저자"+"\t"+"출판사"+"\t"+"분류");
		Book book1 = new Book();
		book1.setTitle("82년생 김지영");
		book1.setAuthor("조남주");
		book1.setPublisher("민읍사");
		book1.setSort("소설");
		
		Book book2 = new Book("파리아파트","\t"+"기욤 뭐소","밝은세상","소설");
		book2.print();
		
		Book book3 = new Book("자료구조");
		book3.setAuthor("\t"+"이자료");
		book3.setPublisher("DB출판사");
		book3.setSort("컴퓨터/IT");
		book3.print();
	}
}

class Book{
	private String title;
	private String author;
	private String publisher;
	private String sort;
	
	public Book() {
		
	}
	public Book(String title, String author, String publisher, String sort) {
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		this.sort = sort;
	}
	public Book(String title) {
		this.title = title;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public String getSort() {
		return sort;
	}
	public void setSort(String sort) {
		this.sort = sort;
	}
	public void print() {
		System.out.println(title+"\t"+author+"\t"+publisher+"\t"+sort);
	}
}