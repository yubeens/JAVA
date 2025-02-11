package practice;


class Book{
	private String title;
	private int page;
	private String author;

	public Book(String title, int page, String author) {
		this.title = title;
		this.page = page;
		this.author = author;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
}

class Magazine extends Book {
	private String date;

	public Magazine(String title, int page, String author, String date) {
		super(title, page, author);
		this.date = date;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "책이름: " + getTitle() + "\n" + 
			   "페이지 수: " + getPage() + "\n" + 
			   "저자: " + getAuthor() + "\n" +
			   "발매일: " + date; 
	}
	
	
public class TestMagazine{
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Magazine magazine = new Magazine();
		magazine.setTitle(");
		
		
	
	}

}
}
