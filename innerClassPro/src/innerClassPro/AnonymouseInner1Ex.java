package innerClassPro;

interface Unit3{
	void move();
}

class HumanCamp3{
	private int speed = 10;
	
	public Unit3 getMarine() {
		
		return new Unit3(){
			public void move() {
				System.out.printf("%d 속도로 이동\n",speed);
			}
		};
		
//		class Marine3 implements Unit3{
//
//			@Override
//			public void move() {
//				// TODO Auto-generated method stub
//				System.out.printf("%d 속도로 이동\n",speed);
//			}
//		}
//		return new Marine3();
	}
}
public class AnonymouseInner1Ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HumanCamp3 hc = new HumanCamp3();
		Unit3 unit = hc.getMarine();
		unit.move();
	}

}
