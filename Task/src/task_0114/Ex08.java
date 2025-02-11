package task_0114;

public class Ex08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		다음은 3*4의 2차원 배열을 만들고 이곳에 0~9 범위의 정수를 랜덤하게 저장한 후
//		2차원 배열과 합을 출력하는 프로그램의 실행 결과와 코드이다.
//		빈 곳(question)에 적절한 코드를 삽입하라.
//
//		0	4	4	7
//		7	9	2	4
//		9	1	2	7
//		합은 56
		
		int Array[][] = new int[3][4]; //2차원 정수 배열 선언
//		★question★		  // intArray에 3x4 정수 배열 생성
		
		for (int i= 0; i<3; i++) {
			for (int j=0; j<4; j++) {
				Array[i][j] = (int)(Math.random()*10); 
			}
		}
//      12개의 정수를 랜덤하게 발생시켜 배열에 순서대로 저장한다.
//		for(int i=0; i<3; i++)
//			for(int j=0; j<4; j++)
//				intArray[i][j] = (int)(Math.random()*10); //0~9의 랜덤점수
		for(int i=0; i<Array.length; i++) { //이중 for루프를 사용하여 배열의 각 요소에 0부터 9까지의 랜덤한 정수를 할당당
			for(int j=0; j<Array[i].length; j++) { //intArray[i]범위가 3개로 나뉘어서
				System.out.print(Array[i][j] + "    ");
			}
			System.out.println();
		}
		//3x4 배열을 출력한다.
//		for(int i=0; i <★question★; i++) {     //length 필드를 이용하라
//			for(int j=0; j <★question★; j++)   //length 필드를 이용하라
//				★question★                     //원소 [i][j] 출력
//				System.out.println();   //다음 줄로 넘어감
//		}
		int i=0, sum=0;
		while(i<3) {
			for (int j = 0; j<4; j++) { 
				sum += Array[i][j];
			}
			i++; //while(i<3)조건이 거짓이 될 때까지 1씩 증가시켜 반복, 3보다 크면 중단.
		}
		System.out.println("합은 "+sum);
		//3x4 배열의 합을 구하여 출력한다.
//		int i=0, sum=0;
//		while(i<3 ) { //3개의 각 행에 대해 반복
//			★question★
//			
		
//		}
//		System.out.println("합은 "+sum);
	}

}
