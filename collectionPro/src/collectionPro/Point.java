package collectionPro;

public class Point {
	private int x,y;
	public Point(int x, int y) {
		this.x=x;
		this.y=y;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "("+x+","+y+")"; //(3,5)
	}
	
}
