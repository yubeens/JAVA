package task_0114;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		'일','월','화','수','목','금','토'로 초기화된 문자 배열 day를 선언하고,
//		사용자로부터 정수를 입력받아 7(배열 day의 크기)로 나눈 나머지를 인덱스로 하여
//		배열 day에 저장된 문자를 출력하라. 음수가 입력되면 프로그램을 종료하라. 
//		아래 실행결과와 같이 예외 처리하라.
//
//		정수를 입력하세요 >>15
//		월
//		정수를 입력하세요>>monday (정수가 입력되지 않아 예외 발생)
//		경고! 수를 입력하지 않았습니다. 
//		정수를 입력하세요 >>-1
//		프로그램을 종료합니다...
		
		char [] day = {'일', '월', '화', '수', '목','금','토'};
		Scanner sc = new Scanner(System.in);

		while(true){ //무한루프
			System.out.print("정수를 입력하세요 >>");
		try {  // 예외 처리문!! 오류가 있는지 없는지 검사
			int input = sc.nextInt();
			if (input <0) {
				System.out.println("프로그램을 종료합니다...");
				break;
			}
			int index = input % 7;
			System.out.println(day[index]);
		} catch (Exception e){ //try블록에서 발생한 예외 처리를 위한 블록 , 
			// Exception클래스는 모든 예외의 상위 클래스 -> 모든 종류의 예외를 처리할 수 있다. 
			// e는 Exception클래스의 인스턴스(오브젝트), 예외 객체를 참조하는 변수
			System.out.println("경고! 수를 입력하지 않았습니다.");
			sc.next();
		}
	}

	sc.close();
		
}

}
