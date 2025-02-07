package test01;

public class Person {
	private String name;
	private int age;
	private String gender;
	
	public Person() {}
	public Person(String name, int age, String gender) {
		this.name = name;
		this.age = age;
		this.gender	= gender;
	}
	public void show() {
		System.out.printf("%s %d %s ",name, age, gender);
	}
}
