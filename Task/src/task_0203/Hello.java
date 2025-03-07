package task_0203;

public class Hello {

	public static void main(String[] args) {
		Object x = null; //x는 null값을 가짐
		giveMeAString(x); 
		System.out.println(x);
	} //x값을 매개변수 y로 전달 (값에 의한 호출을 사용하므로 참조값 자체가 복사됨)
	static void giveMeAString(Object y) {
		y = "This is a string"; // y가 새로운 문자열 "this is a string"을 가리키도록 변경되지만, 
								// 이는 y의 지역적인 변경일 뿐 x에겐 영향을 주지 않음.
	}
} 

//자바에서는 모든 것이 call-by-value 방식으로 전달된다. 
//따라서 위의 프로그램에서는 참조 변수 x의 값이 참조 변수 y로 복사된다.
//참조 변수 y의 값을 변경하여도 변수 x의 값은 변경되지 않는다.

