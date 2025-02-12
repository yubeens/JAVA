package practice;

import practice.Magazine;

class Book{
	private String title;
	private int page;
	private String author;

	
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
		Magazine magazine1 = new Magazine();
		magazine1.setTitle("잡지A");
		magazine1.setPage(10);
		magazine1.setAuthor("기자A");
		magazine1.setDate("2010년 2월 25일");
		
		Magazine magazine2 = new Magazine();;
		magazine2.setTitle("잡지 B");
		magazine2.setPage(20);
		magazine2.setAuthor("기자B");
		magazine2.setDate("2010년 3월 8일");
		
		//각 잡지의 정보를 출력
		System.out.println(magazine1);
		System.out.println();
		System.out.println(magazine2);
		
		
	
		}

	}
}


