package task_0203;

//	8. 비행기를 나타내는 Plane 라는 이름의 클래스를 설계하라. 
//	   Plane 클래스는 제작사(예를 들어서 에어버스), 모델(A380), 최대 승객수(500)를 필드로 가지고 있다.

//	(1) 필드를 정의하라. 모든 필드는 전용 멤버로 하라.
//	(2) 모든 필드에 대한 접근자와 설정자 메소드를 작성한다.
//	(3) Plane 클래스의 생성자를 몇 개를 중복 정의하라. 생성자는 모든 데이터를 받을 수도 있고 아니면 하나도 받지 않을 수 있다.
//	(5) PlaneTest라는 이름의 테스트 클래스를 만드는데 main()에서 Plane 객체 여러 개를 생성하고 접근자와 설정자를 호출하여 보라.
//	(6) Plane 클래스에 지금까지 생성된 비행기의 개수를 나타내는 정적 변수인 planes를 추가하고 생성자에서 증가시켜 보자.
//	(7) Plane 클래스에 정적 변수 planes의 값을 반환하는 정적 메소드인 getPlanes()를 추가하고 main()에서 호출하여 보라.

class Plane {
	//(1)필드 정의 (모두 private으로 설정)
	private String company;
	private String model;
	private int maxcount;
	
	//(6)정적변수 planes : 생성된 비행기 개수를 저장
	private static int planes = 0;
	
	//(2) 접근자 설정자 메소드 
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getMaxcount() {
		return maxcount;
	}
	public void setMaxcount(int maxcount) {
		this.maxcount = maxcount;
	}
	//(3) 기본생성자 & 모든 데이터를 받는 생성자
	public Plane() {
		this.company="unknown";
		this.model="unknown";
		this.maxcount=0;
		planes++;
	}
	
	public Plane(String company, String model, int maxcount) {
		this.company=company;
		this.model=model;
		this.maxcount=maxcount;
		planes++;
	}
	//(7) 현재 생성된 비행기 개수를 반환하는 정적 메소드
	public static int getPlanes() {
		return planes;
	}
	//비행기 정보 출력
	public void printInfo() {
		System.out.println("제작사: "+company+", 모델: "+model+", 최대 승객수: "+maxcount);
	}
}

public class PlaneTest{
	public static void main(String[] args) {
		//(5) 여러 개의 Plane 객체 생성
		Plane p1 = new Plane("Airbus", "A380", 500);
        Plane p2 = new Plane("Boeing", "747", 450);
        Plane p3 = new Plane(); // 기본 생성자 사용
        Plane p4 = new Plane("Embraer", "E190", 120);
        
        //(5) 생성된 비행기 정보 출력
        p1.printInfo();
        p2.printInfo();
        p3.printInfo();
        p4.printInfo();
        
        //(5) p3의 정보 변경 (setter 사용)
        p3.setCompany("jejuair");
        p3.setModel("B005");
        p3.setMaxcount(300);
        
        System.out.println("수정된 p3 정보");
        p3.printInfo();
        
        //(7) 생성된 비행기 개수 출력
        System.out.println("총 생성된 비행기 개수: "+ Plane.getPlanes());
	}
	
}














