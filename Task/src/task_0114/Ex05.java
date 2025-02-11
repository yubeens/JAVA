package task_0114;

public class Ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		크기가 10인 배열을 작성하고 Math.random()함수를 사용하여 1~100사이의 숫자를 랜덤하게 생성하
//		고 생성된 숫자가 3의 배수인 것만 배열에 저장하는 프로그램을 작성하라.
//		(단 배열의 각 요소는 서로 다른 값만 저장되도록 한다.)
		
		int[] array = new int [10]; //크기가 10인 배열 생성
				
		int index = 0; // 배열의 위치를 나타내는 변수를 초기화 (시작 위치는 0번 인덱스)
		
		while (index < 10) { //루프가 배열의 10개 인덱스가 채워질 때까지 실행
			int number = (int)(Math.random()*100) +1;
			//Math.random 0.0이상 1.0미만의 실수를 반환 *100을 해주고 1을 더해 1부터 100까지의 정수를 생성
			if (number % 3 == 0) { //3이 나눠떨어지는 3의 배수인지 확인
				boolean Overlapped = false; //중복된 값은 초기값을 false로 줌
				
				for (int i=0; i < index; i++) { //현재까지 배열에 저장된 값들을 index까지 순차적으로 확인
					if (array[i] == number) { 
						Overlapped = true; //중복된 값이 있으면 true로 설정
						break; //중복된 값이 발견되면 더 이상 확인할 필요 없으므로 반복문 종료
					}
				}
				if (!Overlapped) { 
					array[index] = number; //중복되지 않는 숫자만 배열에 추가
					index++; //배열의 현재위치에 값을 저장하고,증가시켜 다음 위치로 이동
				}
			}
		}
		System.out.println("배열에 저장된 숫자들을 출력");
		for (int num : array) {
			System.out.print(num + " ");
		}
	
	}
}
	
	


