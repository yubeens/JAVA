package test05;

public class PersonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person();
		p1.name = "홍길동";
		p1.age = 20;
		p1.gender = "남자";
		p1.display();
		
		Person p2 = new Person("홍길순",30,"여자");
		p2.setName ("조유빈");
		p2.display();
		
		System.out.println(p1.nameEqual(p2));
	}

}
