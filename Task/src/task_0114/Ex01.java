package task01;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		1. 지불할 금액을 정수로 입력 받아 화폐단위가 각각 몇 개씩 필요한지 출력하는 프로그램을 작성하시오.
//		입력은 최소 10만원 단위로 입력,
//		화폐단위는 50000, 10000, 5000, 1000, 500, 100, 50, 10, 5, 1 10가지이며, ★배열
//		가능한 큰 화폐단위로 지불, 입력이 236,873이면 50000원권 4매, 10000원권 3매, 5000원권 1매,  ★max
//		1000원권 1매, 500원 1매, 100원권 3매, 50원권 1매, 10원권 2매, 5원권 0매, 1원권 3개로 출력하라.
//		단 화폐단위는 배열에 저장한다.
		
		//화폐 단위 배열
		int[] coin= {50000,10000,5000,1000,500,100,50,10,5,1};
		
		//각 화폐 단위가 몇개 필요한지 저장할 배열 (화폐단위의 범위 - 10)
		int[] count= new int[coin.length];
		
		Scanner sc=new Scanner(System.in);
		System.out.print("지불할 금액을 입력하세요 : ");
		int money = sc.nextInt();
		
	    // 금액을 화폐 단위별로 나누어 필요한 개수 계산
		// 금액(money)에서 해당 화폐단위(coin)가 몇번 들어갈 수 있는지 
		// ex : money = 760이면 coin[i] = 500 -> 760 / 500 = 1 
		// -> 500원이 1개 필요 -< 이 값을 count[i]에 저장 
		for(int i=0; i<coin.length; i++) { 
			count[i] = money / coin[i];   
			money = money % coin[i];   
			// 나누고 남은 금액의 나머지값을 구한 후 다시 돌아가 밑의 조건으로 계산 (반복) 
			//-> money % coin[i] (ex: money =760 , coin[i] = 500 
			// 760 % 500 = 260 <- 500원 제외 나머지 금액 260원 <- 다시 뒤에 작은 화폐단위 값으로 계산
		}
		
		System.out.println("▼지불할 금액에 대한 화폐 단위 개수▼ ");
		for(int i=0; i<coin.length; i++) {
			System.out.println(coin[i]+"원권 "+count[i]+"개");
			}
		
		sc.close();
		
		}
	}