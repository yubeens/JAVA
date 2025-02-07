package test01;

import java.util.Scanner;

class Book{
	String title, author; //형이 같으면 한번에 선언가능
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}
	public void display() {
		System.out.println(title + ", " + author);
	}
}

public class BookArrayTest {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book[] books = new Book[2];
		
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<books.length; i++) {
			System.out.print("제목>>");
			String title = sc.nextLine(); //한 줄의 (띄워쓰기 포함) 문장을 전부 인식
			System.out.print("저자>>");
			String author = sc.nextLine();
			books[i] = new Book(title,author);
		}
		for(Book book : books) {
			book.display();
		}
		
	}

}
