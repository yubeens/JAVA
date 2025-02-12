package test01;

import java.util.Scanner;

public class CRUDEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		boolean flag = false;
		DAO dao;
		while(true) {
			System.out.print("1.입력, 2.출력, 3.수정, 4.삭제, 5.검색, 6.종료 >> ");
			int n = sc.nextInt();
			
			switch(n) {
				case 1: 
					System.out.println("제목, 내용, 작성자 입력");
					String title = sc.next();
					String content = sc.next();
					String writer = sc.next();
					
					dao = new DAO();
					dao.insert(title, content, writer);
					break;
					
				case 2:
					dao = new DAO();
					dao.selectAll();
					break;
					
				case 3:
					System.out.println("제목, 내용, 번호 입력");
					title = sc.next();
					content = sc.next();
					int bno = sc.nextInt();
					
					dao = new DAO();
					dao.update(title, content, bno);
					break;
					
				case 4:
					System.out.println("삭제할 데이터 (행)번호 입력");
					bno = sc.nextInt();
					
					dao = new DAO();
					dao.delete(bno);
					break;
				case 5:
					System.out.println("검색할 데이터 번호 입력");
					bno = sc.nextInt();
					
					dao = new DAO();
					dao.selectOne(bno);
					break;
					
				case 6: flag = true;
				
				default: System.out.println("입력오류");
			}
			if(flag)break;
			
		}
		System.out.println("End");
	}

}
