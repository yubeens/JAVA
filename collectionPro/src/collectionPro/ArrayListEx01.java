package collectionPro;

import java.util.ArrayList;

public class ArrayListEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> a=new ArrayList<>();
		a.add("hello");
		a.add("Hi");
		a.add("Java");
		a.add(1,"사과");
//		a.remove("Hi"); //값을 직접 주입하여 remove 실행 가능
		System.out.println(a.contains("사과")); //해당 컬렉션에 특정 요소가 포함되어 있는지
		
		
		for(int i=0; i<a.size(); i++) {
			System.out.println(a.get(i));
		}
		Object[] arr=a.toArray();
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		
//		a.clear();
//		System.out.println(a.isEmpty());
//		System.out.println("Clear 이후");
//		
//		for(int i=0; i<a.size(); i++) {
//			System.out.println(a.get(i));
//		}
	}
}
