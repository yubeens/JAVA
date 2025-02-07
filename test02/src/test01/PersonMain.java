package test01;

public class PersonMain {
	static void display(Person p,String str) {
		if(str.equals("p")) {
			p.show();
		System.out.println();
		}
		else if(str.equals("s")) {
			Student s = (Student)p;
			p.show();
		}
		else if(str.equals("e")) {
			Employee e=(Employee)p;
			e.show();
		}
	}

	public static void main(String[] args) {
		Person p1 = new Person("홍",20,"남자");
		display(p1,"p");
		Student s1 = new Student(1,"홍길동",25,"남자","컴공");
		display(s1,"s");
		Employee e1 = new Employee(2,"박경미",22,"여자","교수","정보통신",300);
		display(e1,"e");
		
		Person[] persons = new Person[3];
		persons[0] = new Person("홍",20,"남자");
		persons[1] = new Student(1,"홍길동",25,"남자","컴공");
		persons[2] = new Employee(2,"박경미",22,"여자","교수","정보통신",300);
		
		for(Person p:persons) {
			p.show();
		}
		
		// TODO Auto-generated method stub
//		Student s = new Student(1,"홍길동",20,"남자","컴공");
//		s.showStudent();
//		Employee e = new Employee(1,"홍길동",35,"남자","영업부","과장",400);
//		e.showEmployee();
		
//		Person p1 = new Person("홍",20,"남자");
//		Student s1 = (Student)p1;
//		
//		Person p = new Student(1,"홍길동",20,"남자","컴공"); 
//		p.showPerson();  =>업캐스팅
//		Student s = (Student)p;
//		s.showStudent();  =>다운캐스팅
	}

}
