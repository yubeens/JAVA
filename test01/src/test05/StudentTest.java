package test05;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student();
		Student s2 = new Student(1, "홍길동");
		Student s3 = new Student(2, "홍길순","컴공");
		
		s1.display();
		s2.display();
		s3.display();
		
	}

}
