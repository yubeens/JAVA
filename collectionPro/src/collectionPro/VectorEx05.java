package collectionPro;

import java.util.ArrayList;
import java.util.Vector;

public class VectorEx05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> a=new ArrayList<>();
		a.add(10);
		a.add(20);
		a.add(1,100);
		
		for(int i=0; i<a.size(); i++) {
			System.out.println(a.get(i));
		}
		
		System.out.println(a.size()); //array는 capacity(용량) 없음
		System.out.println(a.get(0));
		System.out.println(a.get(1));
		System.out.println(a.get(2));
		a.remove(0);
//		a.remove(100);
		
		Vector<String> v = new Vector<>();
		v.add("홍길동");
		v.add("김소정");
		v.add(1,"지정우");
		
		System.out.println(v.size()); //벡터가 포함하는 요소의 개수
		System.out.println(v.capacity()); //현재 용량 (기본 10)
		
		System.out.println(v.get(0));
		System.out.println(v.get(1));
		System.out.println(v.get(2));
		v.remove(0); //index의 요소 삭제
		v.remove("김소정");
	}

}
