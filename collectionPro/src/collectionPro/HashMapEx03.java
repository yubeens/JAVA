package collectionPro;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapEx03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, Student> map = new HashMap<>();
		map.put(1, new Student(1, "홍길동","정보통신",70));
		map.put(2, new Student(2, "박경미","컴공",80));
		map.put(3, new Student(3, "정희선","멀티미디어",85));
		map.put(4, new Student(4, "조만현","컴공",90));
		map.put(5, new Student(5, "최원호","정보통신",85));
		
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("학번입력>>");
			int sno = sc.nextInt();
			if(sno==0) break;
			Student s = map.get(sno);
			if(s==null) { //s를 못찾았을 때
				System.out.println("데이터 없음");
			}else {
				System.out.println(s);
			}
		}
	}

}
