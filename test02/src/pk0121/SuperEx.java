package pk0121;

class Point {
	private int x,y;
	public Point() {
	}
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public void showPoint() {
		System.out.println("("+x+","+y+")");
	}
}
class ColorPoint extends Point{
	private String color;
	public ColorPoint(int x, int y, String color) {
		super(x,y);
		this.color = color;
	}
	public void showColorPoint() {
		System.out.print(color);
		showPoint();
	}
}
public class SuperEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ColorPoint cp = new ColorPoint(5,6,"blue");
		cp.showColorPoint();
	}
}


