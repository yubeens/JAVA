package test03;

public class Circle {
	
	int radius;
	void set(int r) {radius = r;}
	double getArea() {return 3.14*radius*radius;}
	
	//클래스에 생성자가 하나도 선언되지 않은경우, 컴파일러에 의해 자동으로 삽입되나
	//생성자를 하나라도 작성한 경우 기본 생성자가 자동으로 생성되지 않기에 직접 선언해야함.
	public Circle() { 
	}	
	
	public Circle(int r) {
		radius = r;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle pizza = new Circle(10);
		System.out.println(pizza.getArea());
		
		Circle donut = new Circle();
		System.out.println(donut.getArea());
	}

}
