package pk0121;

public class Student extends Person{
	public void set() {
		age = 30;
		name = "홍길동";
		height = 175;
//		weight = 99; private로 직접접근불가
		setWeight(99);
		System.out.println(getWeight());
	}
}
