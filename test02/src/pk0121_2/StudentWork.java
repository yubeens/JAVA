package pk0121_2;

import pk0121.Student;

public class StudentWork extends Student {
	public void set() {
//		age = 30;
		name = "abcd";  //protected
		height = 178;   //public
		setWeight(99); 
		setAge(30); 
		System.out.println(getWeight());
		System.out.println(getAge()); //private 접근할 수 있는 방법
		
	}

}
