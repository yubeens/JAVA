package task_0203;

//public class Point {
//	pirvate int x,y;
//
//	=> 생성자 처럼 보이지만, 실제로는 메서드이다. 반환형이 있으면 안되므로 void를 쓰면 안됨.
//	public void Point(int x, int y) {

//	=> this 키워드가 필요 : x=x;, y=y;는 지역변수가 자기 자신에게 값을 할당하는 의미가 되어버리며 아무일도 하지않는 코드가 되므로
//	   원래 의도라면 멤버 변수에 값을 할당해야한다. 

//		x = x;
//		y = y;
//	}
//}

public class Point {
	private int x, y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

//생성자는 반환형이 없어야한다.
//멤버 변수와 매개변수가 같을 때는 this를 사용해야함.
//this.x = x;는 "이 클래스의 변수 x에 매개변수 x의 값을 넣어라" 라는 뜻.