package generic;

public class MyStackEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GStack<String> stringStack = new GStack<>(); //String 타입의 GStack생성
		stringStack.push("seoul");
		stringStack.push("busan");
		stringStack.push("LA");
		
		for(int n=0; n<3; n++) {
			System.out.println(stringStack.pop()); //stringStack 스택에 있는 3개의 문자열 팝
		}
		
		GStack<Integer> intStack = new GStack<Integer>(); //Integer 타입의 GStack 생성
		intStack.push(1);
		intStack.push(2);
		intStack.push(3);
		
		for(int i=0; i<3; i++) {
			System.out.println(intStack.pop()); //intStack 스택에 있는 3개의 정수 팝
		}
		
	}

}
