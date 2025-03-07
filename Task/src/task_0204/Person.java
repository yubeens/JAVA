package task_0204;

import java.util.ArrayList;
import java.util.Scanner;

class Person {
	private String name;
	private int age;
	private String gender;
	
	public Person() {}
	public Person(String name, int age, String gender){
		this.name=name;
		this.age=age;
		this.gender=gender;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name + " " + age + " " + gender;
	}
	
	public String getName() {
        return name;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Person> p = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<5; i++) {
			System.out.print("이름,나이,성별을 입력하세요>>");
			String name = sc.next();
			int age = sc.nextInt();
			String gender = sc.next();
			p.add(new Person(name,age,gender));
		}
		System.out.println("▼Collection▼");
		for(int i=0; i<p.size(); i++) {
			Person person = p.get(i);
			System.out.println(person);
		}
		System.out.print("이름을 입력하세요 >>");
		String name = sc.next();
		boolean flag = false;
		for(int i=0; i<p.size(); i++) {
			Person person = p.get(i);
			if(name.equals(person.getName())) {
				System.out.println(person);
				flag = true;
				break;
			}
		}
		if(!flag) {
			System.out.println("검색한 이름이 없습니다.");
		}
		
	}

}
