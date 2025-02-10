package innerClassPro;

class Outer1{
	private int speed=10;
	
	class MemberInner1{
		//외부 클래스의 자원(speed)사용 가능
		public void move() {
			System.out.printf("인간형 유닛이 %d 속도로 이동%n",speed);
		}
	}
	public void getMarine() {
		MemberInner1 inner = new MemberInner1();
		inner.move();
	}
}

public class MemberInnerEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer1 out = new Outer1();
		//out기반으로 생성된 객체의 메소드 호출
		out.getMarine();
		
		//out기반으로 내부 클래스 객체 생성
		Outer1.MemberInner1 inner = out.new MemberInner1();
		//inner 기반으로 생성된 객체의 메소드 호출
		inner.move();
	}

}
