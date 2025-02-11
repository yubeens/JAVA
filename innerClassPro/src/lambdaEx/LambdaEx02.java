package lambdaEx;

interface Unit6{
	void move(String s);
}

public class LambdaEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Unit6 unit = new Unit6() {

			@Override //익명클래스 unit6 추상메소드
			public void move(String s) {
				// TODO Auto-generated method stub
				System.out.println(s);
			}
			
		}; //익명클래스
		unit.move("Lambda : Unit6");
	}

}
