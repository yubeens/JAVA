package collectionPro;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, String> map = new HashMap<>();
		map.put("홍길동", "010-2222-2222");
		map.put("김태영", "010-3333-3333");
		map.put("이준목", "010-5555-2222");
		map.put("정현민", "010-7777-2222");
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("전화번호를 검색할 이름>>");
			String name = sc.next();
			if(name.equals("quit")) {
				break;
			}
			String number = map.get(name);
			if(number==null)
				System.out.println("등록된 데이터가 없음.");
			else
				System.out.println(number);
		}
	}

}
