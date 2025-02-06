package task_0204;

import java.util.Scanner;

//p.281 6번 문제
//Math.random()의 난수 발생기를 이용하여 사용자와 컴퓨터가 하는 가위바위보 게임을 만들어보자.
//가위,바위,보는 각각 1,2,3 키이다. 사용자가 1,2,3 키 중 하나를 입력하면 동시에 프로그램에서 난수 발생기를 이용하여
//1,2,3 중에 한 수를 발생시켜 컴퓨터가 낸 것을 결정한다. 그리고 사용자와 컴퓨터 둘 중 누가 이겼는지를 판별하여 승자를 출력한다.

//가위(1), 바위(2), 보(3), 끝내기(4)>> 1
//사용자 가위 : 컴퓨터 바위
//사용자가 졌습니다.
//가위(1), 바위(2), 보(3), 끝내기(4)>> 3
//사용자 보 : 컴퓨터 바위
//사용자가 이겼습니다.
////가위(1), 바위(2), 보(3), 끝내기(4)>> 4
//게임을 종료합니다.

public class RpsGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		while(true) {
		//사용자에게 입력 받기
		System.out.println("가위(1), 바위(2), 보(3), 끝내기(4)>> ");
		int Input = sc.nextInt();
		
		//게임 종료
		if(Input == 4) {
			System.out.println("게임을 종료합니다.");
			break;
		}
		
		//사용자의 입력이 유효한지 확인
		if (Input < 1|| Input >3) {
			System.out.println("잘못 입력하였습니다");
			continue;
		}
		
		//컴퓨터의 선택
		int comInput = (int)(Math.random()*3)+1; //1~3 사이의 난수
		
		//게임 결과 출력
		String Inputv ="";
		String comInputv ="";
		
		if(Input == 1) {
			Inputv = "가위";
		}else if (Input ==2) {
			Inputv = "바위";
		}else if (Input ==3) {
			Inputv = "보";
		}
		
		if(comInput ==1) {
			comInputv = "가위";
		}else if(comInput ==2) {
			comInputv = "바위";
		}else if(comInput ==3) {
			comInputv = "보";
		}
		
		System.out.println("사용자 "+Inputv+" : 컴퓨터 "+comInputv);
		
		//승패 판별
		if(Input == comInput) {
			System.out.println("비겼습니다.");
		}else if((Input == 1 && comInput ==2)||
				 (Input == 2 && comInput ==3)||
				 (Input == 3 && comInput ==1)) {
			System.out.println("사용자가 졌습니다.");
		}else {
			System.out.println("사용자가 이겼습니다.");
		}
	}
	sc.close();
	}

}
