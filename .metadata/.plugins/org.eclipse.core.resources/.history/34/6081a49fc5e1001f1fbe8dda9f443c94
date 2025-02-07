package exam001;

import java.util.Scanner;

public class ProductInfo {
	static Scanner sc = new Scanner(System.in);
	static int id=1;
	static Product input() {
		Product p = null;
		System.out.println("1. 책|2. 앨범|3. 회화책 >>");
		int num = sc.nextInt();
		System.out.print("상품설명>>");
		sc.nextLine();
		String comment = sc.nextLine();
		System.out.print("생산자>>");
		String productor = sc.next();
		System.out.println("가격>>");
		int price = sc.nextInt();
		
		switch(num) {
		case 1:
			System.out.print("title>>");
			sc.nextLine();
			String title = sc.nextLine();
			System.out.print("author>>");
			sc.nextLine();
			String author = sc.nextLine();
			p = new Book(id++, comment, productor, price, title, author);
			break;
		case 2:
			System.out.print("albumTitle>>");
			sc.nextLine();
			String albumTitle = sc.nextLine();
			System.out.print("singer>>");
			sc.nextLine();
			String singer = sc.nextLine();
			p = new CompackDisc(id++, comment, productor, price, albumTitle, singer);
			break;
		case 3:
			System.out.print("title>>");
			sc.nextLine();
			title = sc.nextLine();
			System.out.print("author>>");
			author = sc.nextLine();
			System.out.println("language>>");
			String language = sc.next();
			p = new ConversationBook(id++, comment, productor, price, title, author, language);
			break;
			
			default:
				System.out.println("입력오류");
		}
		return p;
		
	}
	static void search(Product[] products, int k) {
		boolean flag = false;
		System.out.print("상품 아이디>>");
		int id=sc.nextInt();
		for(int i=0; i<k; i++) {
			if(products[i].getId()==id) {
				products[i].display();
				System.out.println();
				flag=true;
				break;
			}
		}
		if(!flag) {
			System.out.println("찾는 상품이 없습니다.");
		}
	}
	
	static void show(Product[] products, int k) {
		for(int i=0; i<k; i++) {
			products[i].display();
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product[] products = new Product[10];
		int k=0;
		boolean flag = false;
		while(true) {
			System.out.println("1. 상품추가|2. 상품조회|3. 전체보기|4.종료");
			System.out.print("선택>>");
			int num = sc.nextInt();
			
			switch(num) {
				case 1: products[k++]=input(); break;
				case 2: search(products, k); break;
				case 3: show(products, k); break;
				case 4: flag = true; break;
				default:
					System.out.println("번호를 잘못 입력하였습니다.");
			}
			if(flag)
				break;
		}
		System.out.println("End");
	}

}
