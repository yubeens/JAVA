package task_0204;

import java.util.Scanner;

//p.283 bonus 2번문제
//StringBuffer클래스를 이용하여 사용자로부터 영문 한 줄을 입력받고, 
//글자 하나만 랜덤하게 선택하여 다른 글자로 수정하여 출력하는 프로그램을 작성
//공백도 수정에 포함!

// >>I love Java
// I love Jbva
// >>Falling in love with Java
// Fallinr in love with Java
// >>exit
// 종료합니다...

public class Modify {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print(">>");
			String s = sc.nextLine(); //한 줄 읽기
			
			StringBuffer sb = new StringBuffer(s); //문제 1 -StringBuffer 객체 생성
			if(sb.toString().equals("exit")) { //sb의 문자열이 "exit"이면 종료
				System.out.println("종료합니다...");
				break;
			}
			int index = (int)(Math.random()*s.length()); //변경할 문자 위치 선택
			while(true) {
				int i = (int)(Math.random()*26); //알파벳 중에서 선택
				char c = (char)('a'+i); //삽입할 문자 결정
				if(sb.charAt(index) !=c) { //sb의 문자와 c가 다른 경우
					//sb에서 index에 있는 문자를 문자 c로 변경
					sb.replace(index, index+1, String.valueOf(c)); // 문제 4 - 문자 변경
					break;
				}
			}
			System.out.println(sb);
		}//end of wile
		sc.close();
	}

}
