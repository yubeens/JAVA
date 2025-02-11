package task_0114;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		임의의 숫자를 입력하여 369게임을 간단하게 작성. 1-99까지 정수를 입력하고 3,6,9 중 하나가 있는
//		경우 ‘박수짝’을 출력하고, 두 개 있는 경우 ‘박수짝짝’을 출력하는 프로그램을 작성하라.
		
		 Scanner scanner = new Scanner(System.in);

	        System.out.print("숫자를 입력하세요. (1-99 사이의 정수 입력): ");
	        int sc = scanner.nextInt();
	        
	        //입력받은 값이 1보다 작거나 99보다 크면 리턴
	        if (sc < 1 || sc > 99) {
	            System.out.println("잘못 입력하였습니다. 다시 1에서 99 사이의 정수를 입력해주세요.");
	            return;
	        }
	        // 숫자 1을 초기값 지정 후 입력받은 값에 도달하면 num에 값을 대입하고
	        // 문자열로 변환해준다 -> 3,6,9를 구분하기 쉽게하기 위해
	        for (int num = 1; num <= sc; num++) {
	            String numStr = String.valueOf(num); 
	            int clapCount = 0;

	            // 3, 6, 9 포함 여부 확인
	            for (char ch : numStr.toCharArray()) { //문자열로 변환된 1부터 입력받은 값까지를 순회해준다
	                if (ch == '3' || ch == '6' || ch == '9') { //조건 3,6,9가 포함된 문자열 -> ch에 대입
	                    clapCount++; //조건 개수 (99까지이기 때문에 조건이 해당되는 문자열에 횟수1, 횟수2가 적용된다)
	                }
	            }

	            // 결과 출력
	            if (clapCount == 1) { //박수를 한번쳐야할 때 문자와 함께 출력
	                System.out.println(num + " > 박수짝");
	            } else if (clapCount == 2) { //박수를 두번 쳐야할 때 문자와 함께 출력
	                System.out.println(num + " > 박수짝짝");
	            } else { //그 외에 해당되지 않는 값들은 숫자를 그대로 표시
	                System.out.println(num);
	            }
	        }
	    }
	}