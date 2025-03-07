package stringPro;

import java.util.Scanner;
import java.util.StringTokenizer;

public class StringTokenizerEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		while(true){
			System.out.print("숫자1, 연산자, 숫자2를 입력하세요 >>");
			String s=sc.nextLine();
			if(s.equals("quit")) break;
			
			StringTokenizer st=new StringTokenizer(s,"+-*/%",true); //구분자도 토큰으로 출력
			int num1=Integer.parseInt(st.nextToken().trim()); //정수 변환
			String op=st.nextToken();
			int num2=Integer.parseInt(st.nextToken().trim());
			
			switch(op) {
			case "+":System.out.println(num1+num2); break;
			case "-":System.out.println(num1-num2); break;
			case "*":System.out.println(num1*num2); break;
			case "/":System.out.println(num1/num2); break;
			case "%":System.out.println(num1%num2); break;
			default:
				System.out.println("입력 오류");
			}
		}
		sc.close();
	}
}
