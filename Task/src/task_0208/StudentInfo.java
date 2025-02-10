package task_0208;

//3. 학생정보를 나타내는 Student 클래스에 이름, 학과, 학번, 학점, 학점 평균저장하는 필드를 작성하라.

//(1)학생 객체를 생성하고 5명을 학생정보를 ArrayList<Student> 컬렉션에 저장한 후에,
//ArrayList<Student>의 모든학생(5명) 정보를 출력하고 학생의 이름을 입력받아
//해당 학생의 학점 평균을 출력하는 프로그램을 작성하라.

//(2)ArrayList<Student> 대신, HashMap<String, Student> 해시맵을 이용하여 다시 작성하라.
//해시맵의 키는 학생이름으로 한다.
//-------------------------------------------
//학생이름, 학과, 학번, 학점평균을 입력하세요.
//        >> 홍길동 모바일 1  4.1
//        >> 이재문 안드로이드 2 3.9
//        >> 김남윤 웹공학 3 3.5
//        >> 최찬미 빅데이터 4 4.25
//        >> 정희선 컴퓨터공학 5 3.0---------------------------------------
//이름 : 홍길동
//학과 : 모바일
//학번 : 1
//학점 평균 : 4.1----------------------------
//이름 : 이재문
//학과 : 안드로이드
//학번 : 2
//학점 평균 : 3.9-----------------------------
//이름 : 김남윤
//학과 : 웹공학
//학번 : 3
//학점 평균 : 3.5---------------------------
//이름 : 최찬미
//학과 : 빅데이터
//학번 : 4
//학점 평균 : 4.25---------------------------
//이름 : 정희선
//학과 : 컴퓨터공학
//학번 : 5
//학점 평균 : 3.0---------------------------
//학생 이름 >> 최찬미
//최찬미, 빅데이터, 4, 4.25
//학생 이름 >> 이재문
//이재문, 안드로이드, 2, 3.9
//학생 이름 >> 그만

import java.util.ArrayList;
import java.util.Scanner;

class Student {
    String name;
    String major;
    int sno;
    double gradeAverage;

    public Student(String name, String major, int sno, double gradeAverage) {
        this.name = name;
        this.major = major;
        this.sno = sno;
        this.gradeAverage = gradeAverage;
    }
    public void printStudentInfo(){
        System.out.println("이름: "+name);
        System.out.println("학과: "+major);
        System.out.println("학번: "+sno);
        System.out.println("학점 평균: "+gradeAverage);
        System.out.println("------------------------");
    }
}
public class StudentInfo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> studentList = new ArrayList<>();

        studentList.add(new Student("홍길동","모바일",1,4.1));
        studentList.add(new Student("이재문","안드로이드",2,3.9));
        studentList.add(new Student("김남윤","웹공학",3,3.5));
        studentList.add(new Student("최찬미","빅데이터",4,4.25));
        studentList.add(new Student("정희선","컴퓨터공학",5,3.0));

        //모든 학생 정보 출력
        for(Student student : studentList){
            student.printStudentInfo();
        }
        //학생 이름을 입력받고 해당 학생의 정보 출력
        while(true){
            System.out.print("학생 이름>>");
            String inputName = sc.nextLine();

            if(inputName.equals("그만")){
                break;
            }
            boolean found = false;
            for(Student student : studentList){
                if(student.name.equals(inputName)){
                    found = true;
                    System.out.println(student.name+", "+student.major+", "+student.sno+", "+student.gradeAverage);
                    break;
                }
            }
            if(!found){
                System.out.println("학생을 찾을 수 없습니다.");
            }
        }
        sc.close();
    }
}
