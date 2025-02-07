package test05;

import java.util.Scanner;

public class PersonObjTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person[] persons = new Person[5]; // person형 객체의 주소가 5개 > persons
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<persons.length; i++) { //index 0부터 4까지
			System.out.print("이름 입력: ");
			String name = sc.next();
			System.out.print("나이 입력: ");
			int age = sc.nextInt();
			System.out.print("성별 입력: ");
			String gender = sc.next();
			persons[i] = new Person(name,age,gender);
		}
		for(Person p : persons) { // persons주소 안에있는 값을 순차적으로 하나씩 p주소에 할당
			p.display(); 
		}
	}

}
