package packagepro;

public class StudentEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Student.count);
		Student s1 = new Student();
		System.out.println(s1.getCount());// => 학생이 몇명인가?
		System.out.println(Student.count);
		Student s2 = new Student(1,"홍","컴공");
		System.out.println(s2.getCount());
		System.out.println(Student.count);
		Student s3 = new Student();
		System.out.println(s3.getCount());
		System.out.println(Student.count);
		
		//s1.sno=10; 직접접근 불가 (값을 불러올 땐 get, 값을 셋팅할 땐 set)
		s1.setSno(2);
		s1.setName("kim");
		s1.setMajor("정보통신");
		
		System.out.println(s1.getSno());
		System.out.println(s1.getName());
		System.out.println(s1.getMajor());
		
		System.out.println(s2.getSno());
		System.out.println(s2.getName());
		System.out.println(s2.getMajor());
	}

}