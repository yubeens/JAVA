package test_0212;

import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		while(true) {
		System.out.print("소문자 알파벳 하나를 입력하시오>> ");
		char scChar = sc.next().charAt(0) ;
		
		for(char i = 'a'; i <= scChar; i++) {
			for(char c ='a'; c <= i; c++) {
				System.out.print(c);
			}
			System.out.println();
		}
		break;
			
		}sc.close();
	}

}


