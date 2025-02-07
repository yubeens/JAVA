package test02;

public class Point {
	protected int x,y; //private값이면 상속받은 값이라도 직접접근은 불가
	public void set(int x, int y) { //밑에 함수들을 통해서 접근 가능
		this.x=x;
		this.y=y;
	}
	public void showPoint() {
		System.out.println("(" + x +"," + y +")");
	}
}

class ColorPoint extends Point{
	private String color;
	public void setColor(String color) {
		this.color = color;
	}
	public void showColorPoint() {
		System.out.print(color);
		System.out.println(x+","+y); //private은 직접접근 불가
	}
}
