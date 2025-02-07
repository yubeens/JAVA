package test01;

public class ObjectArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle[] c = new Circle[5];
		
		for(int i=0; i<c.length; i++) {
			c[i] = new Circle(i+1, "circle"+i);
			
			System.out.println(c[i].radius);
			System.out.println(c[i].name);
			System.out.println(c[i].getArea());
		}
		
	}

}
