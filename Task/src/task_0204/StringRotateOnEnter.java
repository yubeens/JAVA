package task_0204;

import java.util.Scanner;

//p.284 bonus3번문제
//문자열을 입력받고 String클래스를 이용하여 <Enter>키를 입력할 때마다 
//한 글자씩 회전시켜 출력하는 프로그램을 작성
//q를 입력하면 종료!

//문자열을 입력하세요. 빈 칸이 있어도 되고 영어 한글 모두 됩니다.
//>>떡볶기, 라면, 냉면, 만두, 곱창 다 먹고싶다
//<Enter>를 입력하면 문자열이 한 글자씩 회전합니다.

//볶기, 라면, 냉면, 만두, 곱창 다 먹고싶다.떡 >>
//기, 라면, 냉면, 만두, 곱창 다 먹고싶다.떡볶 >>
//, 라면, 내염ㄴ, 만두, 곱창 다 먹고싶다.떡볶기>>
//.... >> q (종료)

public class StringRotateOnEnter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("문자열을 입력하세요. 빈 칸이 있어도 되고 영어 한글 모두 됩니다.");
		Scanner sc = new Scanner(System.in);
		String text = sc.nextLine(); //사용자 입력 받기
		
		System.out.println("<Enter>를 입력하면 문자열이 한 글자씩 회전합니다.");
		
		while(true) { //while문
		String key = sc.nextLine(); //문제 2 ;
		if(key.equals("")) { //<Enter>키 외에 다른 입력된 키가 없는 경우
			String first = text.substring(0,1);//0번째의 첫번째 문자 알아내기
			String last = text.substring(1); //1부터 ~ (,)가 없으면 끝까지 다 읽어준다.
			
			text = last + first; //문제 5 //나머지 문자열 뒤에 첫 번째 문자 연결
			System.out.print(text+">>"); //문제 6 //완성된 문자열과 ">>"화면 출력

		}
		else if(key.equals("q")) //q를 입력한 경우
			break;
		else //q가 아닌 다른 키가 입력된 경우
			System.out.print(text + " >>"); //현재 문자열 출력
	}
	System.out.println("종료합니다...");
	sc.close();
}
}
