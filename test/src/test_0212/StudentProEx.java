package test_0212;

import java.util.HashMap;
import java.util.Scanner;

public class StudentProEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> scores = new HashMap<String, Integer>();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("학생의 이름과 점수를 입력하세요. (예 : 홍길동 80)");
		
		while(true) {
			System.out.print("학생 이름, 점수>> ");
			String input = sc.nextLine();
			
			if(input.equals("그만")) {
				break;
			}
			String[] parts = input.split(" ");
			String name = parts[0];
			int score = Integer.parseInt(parts[1]);
			
			scores.put(name, score);
			}
		
		while(true) {
			System.out.print("학생의 성적 검색>> ");
			String input2 = sc.next();
			
			if(input2.equals("그만")){
				break;
			}
			if(scores.containsKey(input2)) {
				System.out.println(input2+"의 점수는 "+scores.get(input2)+"점 입니다.");	
			}else {
				System.out.println(input2+"은 등록된 데이터가 아닙니다.");
			}
		}
		System.out.println("End");
        sc.close();
	}

}
