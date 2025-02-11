package test06;

import java.util.Scanner;

public class BookTest {
		static Scanner sc = new Scanner(System.in);
		
		static Book add() {
			System.out.print("title>>");
			String title = sc.next();
			System.out.print("author>>");
			String author = sc.next();
			System.out.print("pub>>");
			String pub = sc.next();
			System.out.print("page>>");
			int page = sc.nextInt();
			Book b = new Book(title,author,pub,page);
			return b;
		}
		static void list(Book[] bks, int k) {
			for(int i=0; i<k; i++) {
				bks[i].display();
			}
		}
		public static void main(String[] args) {
			Book[] books = new Book[10];
			
			boolean flag = false;
			int k =0;
			while(true) {
				System.out.println("1.추가, 2.목록보기, 3.종료");
				int num = sc.nextInt();
				switch(num) {
				case 1: books[k++]=add(); break;
				case 2: list(books, k); break;
				case 3: flag = true; break;
				default: System.out.println("입력 오류");
				}
				if(flag || k==10)
					break;
			}
			System.out.println("end");
					
	}

}
