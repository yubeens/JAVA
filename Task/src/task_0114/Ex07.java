package task01;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		다음과 같이 영어와 한글의 짝을 이루는 2개의 배열을 만들고, 
//      사용자로부터 영어단어를 입력받아 한글을 출력하는 프로그램을 작성하라.
//		"eixt"을 입력하면 프로그램을 종료하라.
//
//		String eng[] = { "student", "love", "java", "happy", "future" };
//		String kor[] = { "학생", "사랑", "자바", "행복한", "미래" };
//
//		영어 단어를 입력하세요>>love
//		사랑
//		영어 단어를 입력하세요>>happy
//		행복한
//		영어 단어를 입력하세요>>jaba
//		그런 영어 단어가 없습니다.
//		영어 단어를 입력하세요>>exit
//		종료합니다...
		
		String[] eng = {"student", "love", "java", "happy", "future"}; //문자열을 나타내는 클래스 / 객체 불변
	    String[] kor = { "학생", "사랑", "자바", "행복한", "미래" };

		Scanner sc = new Scanner(System.in);

		while(true){ //무한루프
			System.out.print("영어 단어를 입력하세요>>");
			String input = sc.nextLine();

			if (input.equals("exit")) {
				System.out.println("종료합니다...");
				break;
			}

			boolean found = false; //변수 값을 false로 초기화
			for (int i= 0; i < eng.length; i++) {
				if (input.equals(eng[i])) { //equlas : 두개의 객체가 동일한지를 비교(순서)
					System.out.println(kor[i]);
					found = true; 
					break; //true가 되면 중단 후 다시 while문으로 돌아감.
				}
			}

			if (!found) {
				System.out.println("그런 영어 단어가 없습니다.");
			}
		}

		sc.close();

	}

}
