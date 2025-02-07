package test06;

class Person{
	String name;
	int age;
	
	public Person(String name, int age) {
		this.name=name;
		this.age=age;
	}
	public void display() {
		System.out.println(name + ", " + age);
	}
}

public class MethodTest {
	
	static void increase(int m) {
		m=m+1;
	}
	
	static void arrayincrease(int[] m) {
		for(int i=0; i<m.length; i++) {
			m[i]+=10;
		}
	}
	static void objMethod(Person p) {
		p.age=30;
		p.name="kkkk";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int[] arr= {1,2,3,4,5};
		Person p= new Person("aaa",20);
		p.display();
		
		increase(a);
		System.out.println(a);
		arrayincrease(arr);
		for(int i:arr) {
			System.out.print(i+" ");
		}
		System.out.println();
		objMethod(p);
		p.display();
		

	}

}
