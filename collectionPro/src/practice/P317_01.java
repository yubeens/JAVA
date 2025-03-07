package practice;

import java.util.Scanner;
import java.util.Vector;

//  1)	Scanner를 사용하여 5개의 실수 값을 사용자로부터 입력받아 벡터에 저장하라
//		그러고 나서 벡터를 검색하여 가장 큰 수를 출력하는 프로그램을 작성하라
// 		3.14 2.2 -5.5 99.9 33.7 
// 		가장 큰 수는 99.9

public class P317_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Vector<Double> numbers = new Vector<>();
		
		System.out.println("5개의 실수를 입력하세요.");
		for(int i=0; i<5; i++) {
			double num = sc.nextDouble();
			numbers.add(num); 
		}
		double max = numbers.get(0);
		for(int i=0; i<numbers.size(); i++) {
			if(numbers.get(i)>max) {
				max = numbers.get(i);
			}
		}
		System.out.println("가장 큰 수는 "+max);
		sc.close();
	}

}
