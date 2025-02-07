package test01;

public class Employee extends Person{
	private int eno;
	private String dept;
	private String position;
	private int sal;
	
	public Employee() {}
	public Employee(int eno, String name, int age, String gender, String dept, String position, int sal) {
		super(name,age,gender);
		this.eno = eno;
		this.dept = dept;
		this.position = position;
		this.sal = sal;
	}
	public void show() {
		System.out.print(eno + " ");
		super.show();
		System.out.println(dept+" "+position+" "+sal);
	}

}
