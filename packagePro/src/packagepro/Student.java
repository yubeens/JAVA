package packagepro;

public class Student {
	private int sno;
	private String name;
	private String major;
	static int count; //static 공용함수 (클래스 당 하나만 생성)
	
	public Student() {
		count++;
		System.out.println("default 생성자");
	}
	public Student(int sno, String name, String major) {
		this.sno = sno;
		this.name = name;
		this.major = major;
		count++;
	}
	
	public static int getCount() {
		return count;
	}
	//오른쪽 우클릭 - source - genarate getters and setters
	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	
	
	
}