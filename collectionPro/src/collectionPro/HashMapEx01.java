package collectionPro;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class HashMapEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, String> h = new HashMap<>();
		h.put("baby", "아기");
		h.put("love","사랑");
		h.put("apple", "사과");
		
		System.out.println(h.get("baby")); //k값으로 v를 찾을 수 있다.
		
		Set<String> keys = h.keySet(); //hashmap에 있는 key만 집합으로 만들기
		//집합에 있는 데이터를 순차적으로 불러올 수 있는 방법 =>Iterator
		Iterator<String> it = keys.iterator();
		while(it.hasNext()) {
			String key = it.next();
			String value = h.get(key);
			System.out.println(key+"=>"+value);
		}
		
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<3; i++) {
			System.out.println("찾고 싶은 단어는?");
			String eng=sc.next();
			String kor=h.get(eng);
			if(kor==null) {
				System.out.println("는 등록되지 않은 단어입니다.");
			}else {
				System.out.println(kor);
			}
		}
	
//		for(int i=0; i<keys.size(); i++){
//			System.out.println(keys.);
//		}
		
//		for(int i=0; i<h.size(); i++){
//		System.out.println(h.get(i));
	}

}
