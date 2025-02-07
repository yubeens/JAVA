package test06;

import java.util.Scanner;

public class EmpTest {
	static Scanner sc = new Scanner(System.in);
	
	static Employee add() {
		System.out.print("사번>>");
		int eno = sc.nextInt();
		System.out.print("name>>");
		String name = sc.next();
		System.out.print("dept>>");
		String dept = sc.next();
		System.out.print("position>>");
		String position = sc.next();
		System.out.print("sal>>");
		int sal = sc.nextInt();
		Employee e = new Employee(eno,name,dept,position,sal);
		return e;
	}
	static void list(Employee[] emps, int k) {
		for(int i=0; i<k; i++) { //실제 employee 주소가 들어있는 값(k) 까지만 display 해준다
			emps[i].display();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee[] employees = new Employee[10]; //주소 10개 저장	
		
		boolean flag = false; //종료 플러그
		int k =0; //k에 값을 대입
		while(true) {
			System.out.println("1.추가, 2.목록보기, 3.종료");
			int num = sc.nextInt();
			switch(num) { //정수를 입력받은 값 case
			case 1: employees[k++]=add(); break; // k를 1증가시켜 저장
			case 2: list(employees, k); break; 
			case 3: flag = true; break; //break가 되면 while문을 벗어남
			default:
				System.out.println("입력 오류");
			}
			if(flag || k==10) // flag조건 또는 배열값이 10이되면 자동 끝
				break;
		}
		System.out.println("end");
	}

}
