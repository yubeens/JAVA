package practice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

//	 5). 5개의 나라 이름과 인구를 입력받아 해시맵에 저장하고, 가장 인구가 많은 나라를 검색하여 출력하는 프로그램을 작성하라.
//	  => HashMap<String, Integer> nations = new HashMap<>();
//		 나라 이름과 인구를 5개 입력하세요.(예: Korea 5000)
//		 나라 이름, 인구 >> Korea 5000
//		 나라 이름, 인구 >> China 1000000
//		 나라 이름, 인구 >> USA 30000
//		 나라 이름, 인구 >> Swiss 2000
//		 나라 이름, 인구 >> France 2500
//		 제일 인구가 많은 나라는 (China, 1000000)

public class P317_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> nations = new HashMap<>();
		Scanner sc = new Scanner(System.in)
				;
		System.out.println("나라 이름과 인구를 5개 입력하세요(예: Korea 5000)");
		for(int i=0; i<5; i++) {
			System.out.print("나라 이름, 인구 >> ");
			String key = sc.next();
			int value = sc.nextInt();
			nations.put(key, value);
		}
		Set<String> keys = nations.keySet();
		Iterator<String> it = keys.iterator();
		
		while(it.hasNext()) {
			String key = it.next();
			int value = nations.get(key);
			System.out.println(key+":"+value);
			
			
		}
		
	}

}
