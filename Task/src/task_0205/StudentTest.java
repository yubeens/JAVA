package task_0205;

//	 5) 다음 그림에 해당하는 클래스를 작성하여 보자. 모든 학생은 이름, 학번, 소속 학과, 학년, 이수 학점 수를 가진다.
//		추가적으로 학부생은 소속 동아리명을 가지고 있고 대학원생은 조교 유형과 장학금 비율을 가진다.
//		조교 유형에는 교육 조교와 연구 조교가 있으며 장학금 비율은 0과 1사이의 값이다. 
//		각 클래스는 적절한 생성자 메소드, 접근자 메소드, 변경자 메소드를 가진다. 이러한 클래스들의 객체를 만들고 각 객체의 모 든 정보를 출력하는 테스트 클래스를 작성하라.
//		
// 출력결과 => 이름: 갑/ 학번: 1000 / 학과: 컴공 / 학년: 3/ 이수학점: 84 / 소속 동아리: 날자날어
//			이름: 갑/ 학번: 1000 / 학과: 컴공 / 학년: 3/ 이수학점: 87 / 소속 동아리: 돌고 돌아
//			이름: 을/ 학번: 100 / 학과: 전자공학 / 학년: 2/ 이수학점: 51 / 조교 유형: 교육 조교 / 장학금 여부: 못받음
//			이름: 병/ 학번: 102 / 학과: 세포생물 / 학년: 3/ 이수학점: 61 / 조교 유형: 연구 조교/ 장학금 여부: 받음

class Student{
	private String name;
	private int sno;
	private String department;
	private int grade;
	private int credit;
	
	public Student(String name, int sno, String department, int grade, int credit) {
		super();
		this.name = name;
		this.sno = sno;
		this.department = department;
		this.grade = grade;
		this.credit = credit;
	}
	public void displayInfo() {
		System.out.print("이름: "+name+" / 학번: "+sno+" / 학과: "+department+" / 학년: "+grade+" / 이수학점: "+credit);
	}
	
}
class Undergraduate extends Student{ //소속동아리
	private String club;

	public Undergraduate(String name, int sno, String department, int grade, int credit, String club) {
		super(name, sno, department, grade, credit);
		this.club = club;
	}

	@Override
	public void displayInfo() {
		// TODO Auto-generated method stub
		super.displayInfo();
		System.out.println(" / 소속 동아리: "+club);
	}
}

//test class
class Graduate extends Student{ //조교 유형과 장학금 비율
	private String assistantType;
	private double scholarshipRatio;
	
	public Graduate(String name, int sno, String department, int grade, int credit, String assistantType,
			double scholarshipRatio) {
		super(name, sno, department, grade, credit);
		this.assistantType = assistantType;
		this.scholarshipRatio = scholarshipRatio;
	}

	@Override
	public void displayInfo() {
		// TODO Auto-generated method stub
		super.displayInfo();
		System.out.println(" / 조교유형: "+assistantType+" / 장학금 여부: "+(scholarshipRatio > 0 ? "받음" : "못받음")); //true, false
	}
}

public class StudentTest { 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Undergraduate ug1 = new Undergraduate("갑",1000,"컴공",3,84,"날자날어");
		Undergraduate ug2 = new Undergraduate("갑",1000,"컴공",3,87,"돌고돌아");
		Graduate grad1 = new Graduate("을",100,"전자공학",2,51,"교육조교",0);
		Graduate grad2 = new Graduate("병",102,"세포생물",3,61,"연구조교",1);
		
		ug1.displayInfo();
		ug2.displayInfo();
		grad1.displayInfo();
		grad2.displayInfo();
	}

}
