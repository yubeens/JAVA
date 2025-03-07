package practice;

import java.util.ArrayList;
import java.util.Scanner;

//  2)	Scanner를 사용하여 학점('A','B','C','D','F')을 5개만 문자로 입력받아 ArrayList에 저장하라.
//		그러고 나서 다시 ArrayList를 검색하여 5개의 학점을 점수(A=4.0, B=3.0, C=2.0, F=0.0)로 변환하여 출력하는 프로그램을 작성하라.
//	  =>빈 칸으로 분리하여 5개의 학점을 입력(A/B/C/D/F)>> B A F C D
//		3.0 4.0 0.0 2.0 1.0

public class P317_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ArrayList<Character> v = new ArrayList<>();
		
		System.out.println("5개의 학점을 입력(A/B/C/D/F)>>");
		String str = sc.next();
		for(int i=0; i<str.length(); i++) {
			v.add(str.charAt(i));
		}
		for(int i=0; i<v.size(); i++) {
			char ch=v.get(i);
			switch(ch) {
			case 'A' :System.out.print(4.0+" ");break;
			case 'B' :System.out.print(3.0+" ");break;
			case 'C' :System.out.print(2.0+" ");break;
			case 'D' :System.out.print(1.0+" ");break;
			case 'F' :System.out.print(0.0+" ");break;
			}
		}
		sc.close();		
		
	}
}

//public static void main(String[] args) {
//    
//    Scanner sc = new Scanner(System.in);
//    ArrayList<String> grade = new ArrayList<>();
//    grade.add("A");
//    grade.add("B");
//    grade.add("C");
//    grade.add("D");
//    grade.add("F");
//    ArrayList<Double> score = new ArrayList<>();
//    score.add(4.0);
//    score.add(3.0);
//    score.add(2.0);
//    score.add(1.0);
//    score.add(0.0);
//    
//    System.out.println("빈 칸으로 분리하여 5개의 학점을 입력(A / B / C / D / F)");
//    String input = sc.nextLine();
//    StringTokenizer st = new StringTokenizer(input, " ");
//    
//    while(st.hasMoreTokens()) {
//        System.out.print(score.get(grade.indexOf(st.nextToken())) + " ");            
//    }
//    
//    sc.close();
//	}
//}
