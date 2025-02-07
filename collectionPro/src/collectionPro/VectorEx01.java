package collectionPro;

import java.util.Vector;

public class VectorEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Integer> v = new Vector<>(); // Vector<Integer> 다이아몬드 연산자에 타입 매개변수 생략
		int n=v.size();
		int c=v.capacity();
		System.out.printf("n=%d,c=%d%n",n,c);
		
		v.add(5);
		v.add(4);
		v.add(-1);
		v.add(2,10); //2번째 자리에 10을 삽입하고 2번째 자리값은 뒤로 물러남.
//		v.remove(1); //1번째 자리를 지우고 나머지 값이 앞으로 땡겨짐.
//		v.remove(10); 값을 직접 주입하여 지울 수도 있으나 숫자는 index인지 obj인지 구분을 하지 못해 실행불가 (문자는 가능)
		System.out.println(v.lastElement()); //마지막 값 출력
		for(int i=0; i<30; i++) {
			v.add((int)(Math.random()*100+1));
		}
//		v.clear(); //값을 모두 지운다.
		n=v.size();
		c=v.capacity();
		System.out.printf("n=%d,c=%d%n",n,c);
			for(int i=0; i<v.size(); i++) {
				System.out.println(v.get(i));
		}
	}
	
}
