package collectionPro;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListEx03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student> a = new ArrayList<>();
		a.add(new Student(1,"홍길동","컴공",85));
		a.add(new Student(2,"정현민","멀티미디어",80));
		a.add(new Student(3,"이동근","컴공",75));
		a.add(new Student(4,"전진육","정보통신",95));
		a.add(new Student(5,"배성훈","멀티미디어",80));
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("학번입력>>");
			int sno = sc.nextInt();
			if(sno==0) break; //0입력 시 종료
			
			boolean flag = false;
			for(int i=0; i<a.size(); i++) {
				Student s =a.get(i);
				if(s.getSno()==sno) {
					System.out.println(s);
					flag = true;
					break;
				}
			}
			if(!flag) { //여전히 false일 경우
				System.out.println("데이터 없음");
			}
		}
	}

}
