package task_0205;

// 2) 일반적인 책을 나타내는 Book 클래스를 상속받아서 잡지를 나타내는 Magazine 클래스를 작성하여 보자.
//	  Book 클래스는 제목, 페이지수, 저자 등의 정보를 가진다. Magazine 클래스는 추가로 발매일 정보를 가진다.
//	  생성자, 접근자, 설정자를 포함하여서 각각의 클래스를 작성한다. 이들 클래스들의 객체를 만들고 각 객체의 모든 정보를
// 	  출력하는 테스트 클래스를 작성하라. 

//	  책 이름 : 잡지A
//	  페이지 수 : 10
//	  저자 : 기자A
//	  발매일 : 2010년 2월 25일
//	  책이름 : 잡지 B
//	  페이지 수 : 20
//	  저자 : 기자B
//	  발매일 : 2010년 3월 8일

//Magazine 클래스 (Book 클래스를 상속)
class Magazine extends Book{
	private String date;

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}
	//toString 메소드를 오버라이드하여 정보를 출력하도록 설정
	@Override
	public String toString() {
		return "책 이름: " + getTitle() + "\n" +
			   "페이지 수: " + getPages() + "\n" +
			   "저자: " + getWriter() + "\n" +
			   "발매일: " + date;
	}
}
//Book 클래스
class Book {
	private String title, writer;
	private int pages;
	
	public String getTitle() {
		return title;
	}
	public String getWriter() {
		return writer;
	}
	public int getPages() {
		return pages;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public void setPages(int pages) {
		this.pages = pages;
	}
}

//테스트 클래스
public class TestMagazine{
	public static void main(String[] args) {
		Magazine magazine1 = new Magazine();
		magazine1.setTitle("잡지A");
		magazine1.setPages(10);
		magazine1.setWriter("기자A");
		magazine1.setDate("2010년 2월 25일");
		
		Magazine magazine2 = new Magazine();
		magazine2.setTitle("잡지 B");
		magazine2.setPages(20);
		magazine2.setWriter("기자B");
		magazine2.setDate("2010년 3월 8일");
		
		//각 잡지의 정보를 출력
		System.out.println(magazine1);
		System.out.println();
		System.out.println(magazine2);
	}
	
}










