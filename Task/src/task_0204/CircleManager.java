package task_0204;
//p.282 bonus 1번문제
//중심을 표현하는 int 타입의 x,y 필드와, 반지름 값을 저장하는 int 타입의 radius 필드를 가진 Circle 클래스를 작성하고자 한다
//생성자는 x,y,radius 값을 인자로 받아 필드를 초기화하고, equals()메소드는 면적이 같으면 두 Circle 객체가 동일한 것으로 판별한다.
//
//Circle 클래스
//
//원 1: (1,2)반지름 10
//원 2: (5,6)반지름 10
//같은 원입니다.

class Circle{
	private int x, y, radius;
	public Circle(int x, int y, int radius) {
			this.x=x;
			this.y=y;
			this.radius=radius; //필드 초기화
	}
	public String toString() { //Circle 객체를 문자열로 리턴
		return "("+x+","+y+")반지름 "+radius;
	}
	@Override
	public boolean equals(Object obj) { //equals() 메소드
		// TODO Auto-generated method stub
		if (obj instanceof Circle) {
			Circle c = (Circle) obj;
		return this.radius == c.radius; //반지름이 같으면 동일한 원으로 간주
	}
	return false;
	}
}

public class CircleManager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle a = new Circle(1,2,10);
		Circle b = new Circle(5,6,10);
		
		System.out.println("원 1: " + a);
		System.out.println("원 2: " + b);
		
		if (a.equals(b))
			System.out.println("같은 원입니다.");
		else 
			System.out.println("다른 원입니다.");;
	}

}
