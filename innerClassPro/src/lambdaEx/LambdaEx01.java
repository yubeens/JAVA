package lambdaEx;

interface Unit5 {
	void move(String s);
}

class Human5 implements Unit5{

	@Override
	public void move(String s) {
		// TODO Auto-generated method stub
		System.out.println(s);
	}
	
}
public class LambdaEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Unit5 unit = new Human5(); //업캐스팅 , 인터페이스 객체 변수에 클래스의 객체 주소를 담을 수 있다
		unit.move("Lambda:Unit5");
	}

}
