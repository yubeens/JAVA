package collectionPro;

import java.util.Vector;

public class VectorEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Integer> v = new Vector<>();
		v.add(5);
		v.add(10);
		v.add(4);
		v.add(1,100); //1자리에 100추가
		
		int sum=0;
		for(int i=0; i<v.size(); i++) {
			int n=v.get(i);
			sum+=n;
			System.out.println(n);
		}
		System.out.println("sum="+sum);
		
	}

}
