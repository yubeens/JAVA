package task_0114;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		컴퓨터와 사용자의 가위바위보 게임 프로그램을 작성하라.
//		사용자가 입력하고 <Enter>키를 치면, 컴퓨터는 랜덤하게 가위,바위,보 중 하나를 선택한다.
//		그리고 누가 이겼는지 출력한다. "그만"을 입력하면 게임을 종료한다.
//
//		컴퓨터와 가위 바위 보 게임을 합니다.
//		가위 바위 보!>>가위
//		사용자 = 가위, 컴퓨터 = 가위, 비겼습니다.
//		가위 바위 보!>>보
//		사용자 = 보, 컴퓨터 = 가위, 컴퓨터가 이겼습니다.
//		가위 바위 보!>> 그만
//		게임을 종료합니다...
//		
//		hint 
//		다음과 같이 문자열 배열을 선언한다
//		String str[]= {"가위","바위","보"};
//		컴퓨터가 내는 것을 랜덤하게 결정하가 위해 다음 코드를 이용한다. 0은 "가위",1은 "바위",2는 "보"로 처리한다.
//		int n=(int)(Math.random()*3); //0,1,2 중에 랜덤 정수 리턴
//		컴퓨터가 낸 것이 "가위"인지 비교하는 코드는 다음과 같이 한다.
//		if(str[n].equals("가위")) // 컴퓨터가 낸 것이 "가위"인지 비교하는 문

        Scanner sc = new Scanner(System.in);
        String str[] = {"가위", "바위", "보"};
        
        System.out.println("컴퓨터와 가위 바위 보 게임을 합니다.");


        while (true) { 
            System.out.print("가위 바위 보!>>");
            String user = sc.next();

            if (user.equals("그만")) {
                System.out.println("게임을 종료합니다...");
                break;
            }

            int n = (int)(Math.random() * 3); //컴퓨터의 선택
            String computer = str[n];

            System.out.print("사용자 = " + user + ", 컴퓨터 = " + computer);

            if (user.equals(computer)) {
                System.out.println(", 비겼습니다.");
            } else if ((user.equals("가위") && computer.equals("보")) ||
                       (user.equals("바위") && computer.equals("가위")) ||
                       (user.equals("보") && computer.equals("바위"))) {
                System.out.println(", 사용자가 이겼습니다.");
            } else {
                System.out.println(", 컴퓨터가 이겼습니다.");
            }
        }
        sc.close();
    }
}