package test01;

public class Student extends Person {
	private int sno;
	private String major;
	
	public Student() {} //디폴트 생성자
	public Student(int sno, String name, int age, String gender, String major) {
		super(name,age,gender);
		this.sno = sno;
		this.major = major;
	}
	public void show() {
		System.out.print(sno+" ");
		super.show();
		System.out.println(major);
	}
	
	
}
