package collectionPro;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> a =new ArrayList<>();
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(40);
		a.add(50);
		
		Iterator<Integer> it=a.iterator();
		while(it.hasNext()) { //모든 요소 방문
			System.out.println(it.next()); //다음 요소 리턴
		}
	}

}
