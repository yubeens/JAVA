package abstractPro;

abstract class Shape{ //추상메소드를 가진 클래스는 앞에 abstract 선언
	public Shape() {}
		public void paint() {
			draw();
	}
	abstract public void draw(); //추상메소드
}

class Line extends Shape{ //추상클래스를 상속받은것은 따로 Override 구현을 해줘야함.
	public String toString() {
		return "Line";
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Line");
	}
}
class Rect extends Shape{

	@Override //자동구현
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Rect");
		
	}
}
class Circle extends Shape{

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Circle");
	}
	
}

abstract class MyComponent{ //추상클래스
	String name;
	public void load(String name) {
		this.name = name;
	}
}
public class AbstractEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Shape s1 = new Shape();
//		MyComponent c1 = new MyComponent();  추상클래스는 객체를 만들 수 없다.
		Line l1 = new Line(); 
		Rect r1 = new Rect();
		Circle c1 = new Circle();
		l1.draw();
		r1.draw();
		c1.draw();
	}

}
