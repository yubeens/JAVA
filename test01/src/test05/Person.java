package test05;

public class Person {
	String name;
	int age;
	String gender;
	
	public Person() {} //기본 생성자
	public Person(String name) { //필드를 초기화하는 생성자
		this.name = name;
	}
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public Person(String name, int age, String gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void display() {
		System.out.println("name: " + name);
		System.out.println("age: " + age);
		System.out.println("gender: " + gender);
	}
	public boolean nameEqual(Person p) {
		if(this.name.equals(p.name)) {
			return true;
		}else {
			return false;
		}
	}
}


