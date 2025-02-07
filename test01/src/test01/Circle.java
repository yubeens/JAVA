package test01;

public class Circle {
	int radius;
	String name;

	public Circle() { //기본생성자, default, 메소드 오버로딩
		
	}
	public Circle(int r) {
		radius=r;
	}
	public Circle(int r, String n) {
		radius = r;
		name = n;
	}
	public double getArea() {
		return 3.14*radius*radius;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle pizza = new Circle();
		System.out.println(pizza.radius);
		System.out.println(pizza.name);
		
		pizza.radius =5;
		pizza.name = "자바피자";
		double area = pizza.getArea();
		System.out.println(pizza.radius);
		System.out.println(pizza.name);
		System.out.println(area);
		
		Circle donut = new Circle(10, "자바도넛");
		System.out.println(donut.radius);
		System.out.println(donut.name);
		area = donut.getArea();
		System.out.println(area);
	}

}
