package lambdaEx;

interface Unit7{
//	void move(String s);
//	int getLength(String s);
//	int sum(int a, int b);
	void move();
}

public class LambdaEx03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Unit7 unit = (String s)->{ 
	
//			System.out.println(s);
//		};
//		unit.move("Lambda Unit7");

//------------------------------------------------		
//		<람다식 문법>
//		Unit7 unit = s -> System.out.println(s); //(String s) <= 매개변수가 한개일 경우 소괄호, 데이터형 생략가능
////				//								  중괄호 안의 구현부가 한 문장인 경우 중괄호 생략가능
////				//								  String parameta(매개변수-함수 정의 시 초기값을 프로그래머스가 정해지는 것)를 전달해주면 s를 출력하라 
//		unit.move("Lambda Unit7");

		
//------------------------------------------------
//		Unit7 unit = s -> {
//			return s.length(); //return이 들어가면 반듯이 중괄호를 적어줘야 함
//		};
//		
//		int len = unit.getLength("abcd");
//		System.out.println(len);
	
//------------------------------------------------
//		Unit7 unit = (a, b)->{
//			return a+b;
//		};
//		System.out.println(unit.sum(10, 20));
		
//------------------------------------------------	
		Unit7 unit = () -> System.out.println("aaa");
		unit.move();
		}
	}
