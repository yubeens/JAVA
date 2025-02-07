package practice;

import java.util.HashMap;
import java.util.Scanner;

// )3	HashMap<String, Integer>컬렉션을 생성하고 "에스프레소"는 2000, "아메리카노"는 2500, "카푸치노"는 3000, "카페라떼"는 3500을 저장하라.
//		그리고 다음과 같이 음료수 이름을 입력받으면 HashMap에서 검색하여 가격을 출력하라
//	  =>에스프레소, 아메리카노, 카푸치노, 카페라떼 있습니다
//		주문 >> 아메리카노
//		아메리카노는 2500입니다.
//		주문 >> 카푸치노
//		카푸치노는 3000입니다.
//		주문>> 그만 (종료)

public class P317_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> menu = new HashMap<>();
		menu.put("에스프레소", 2000);
		menu.put("아메리카노", 2500);
		menu.put("카푸치노", 3000);
		menu.put("카페라떼", 3500);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("에스프레소, 아메리카노, 카푸치노, 카페라떼 있습니다.");
		while(true) {
			System.out.print("주문 >> ");
			String coffee = sc.next();
			if(coffee.equals("그만")) {
				break;
			}
			Integer price = menu.get(coffee);
			System.out.println(coffee+"는 "+price+"입니다.");
			
		}
		sc.close();
		
	}

}
