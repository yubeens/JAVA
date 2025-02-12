package test_0212;

class Student {
    private int sno;
    private String name;
    private int korean;
    private int english;
    private int math;

    public Student(int sno, String name, int korean, int english, int math) {
        this.sno = sno;
        this.name = name;
        this.korean = korean;
        this.english = english;
        this.math = math;
    }

    public int getSno() {
        return sno;
    }

    public String getName() {
        return name;
    }

    public int getKorean() {
        return korean;
    }

    public int getEnglish() {
        return english;
    }

    public int getMath() {
        return math;
    }

    public int getScore() {
        return korean + english + math;  // 총점 계산
    }

    public double getAverage() {
        return getScore() / 3.0;  // 평균 계산
    }

    @Override
    public String toString() {
        return sno + "\t" + name + "\t" + korean + "\t" + english + "\t" + math + "\t" 
               + getScore() + "\t" + String.format("%.1f", getAverage());
    }
}

public class StudentEx {
    public static void main(String[] args) {
        // 5명의 학생 정보 저장
        Student[] students = new Student[5];

        students[0] = new Student(1, "홍길동", 80, 60, 70);
        students[1] = new Student(2, "박경미", 90, 95, 80);
        students[2] = new Student(3, "정희선", 75, 80, 100);
        students[3] = new Student(4, "임혜동", 80, 70, 95);
        students[4] = new Student(5, "조만현", 100, 65, 80);

        System.out.println("학번\t이름\t국어\t영어\t수학\t총점\t평균");
        System.out.println("====================================================");

        // 학생 정보 출력
        for (Student student : students) {
            System.out.println(student.toString());
        }
    }
}
