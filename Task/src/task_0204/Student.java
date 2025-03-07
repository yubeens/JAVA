package task_0204;

import java.util.ArrayList;
import java.util.Scanner;

class Student {
	private int sno;
	private String name;
	private String major;
	private int score;
	
	public Student() {}
	public Student(int sno, String name, String major, int score) {
		this.sno=sno;
		this.name=name;
		this.major=major;
		this.score=score;
	}
	public int getScore() {
		return score;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return sno + " " + name + " " + major + " " + score;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student> a=new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<5; i++) {
			System.out.print("학번,이름,전공,점수를 입력하세요>>");
			int sno = sc.nextInt();
			String name = sc.next();
			String major = sc.next();
			int score = sc.nextInt();
			a.add(new Student(sno,name,major,score));
		}
		System.out.println("▼Collection▼");
		for(int i=0; i<a.size(); i++) {
			Student s = a.get(i);
			System.out.println(s);
		}
		int maxIndex = 0;
		Student maxS=a.get(maxIndex);
		for(int i=1; i<a.size(); i++) {
			Student s=a.get(i);
			if(maxS.getScore()<s.getScore()) {
				maxIndex=i;
				maxS=s;
			}
		}
		System.out.print("점수가 가장 높은 학생>>");
		System.out.println(maxS);
//		System.out.println(a.get(maxIndex));
		
		
//		Student topStudent = a.get(0);
//		for(Student s : a) {
//			if(s.getScore() > topStudent.getScore()) {
//				topStudent = s;
//			}
//		}
//		System.out.print("점수가 가장 높은 학생>>");
//		System.out.println(topStudent);
	}

}
