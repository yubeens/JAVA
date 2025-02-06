package task_0205;

// 1) Person 클래스를 설계하라. Person 클래스는 이름,주소,전화번호를 필드로 가진다.
//	  하나 이상의 생성자를 정의하고 각 필드에 대하여 접근자와 설정자 메소드를 작성하라.
//	  이어서 Person을 상속받아서 Customer를 작성하여보자. Customer는 고객번호와 마일리지를 필드로 가지고 있다.
//	  한 개 이상의 생성자를 작성하고 적절한 접근자 메소드와 설정자 메소드를 작성한다.
//	  이들 클래스들의 객체를 만들고 각 객체의 모든 정보를 출력하는 테스트 클래스를 작성하라

//person 클래스
class Person {
	private String name;
	private String address;
	private String tel;
	
	//디폴트 생성자
	public Person() {}
	//생성자
	public Person(String name, String address, String tel) {
		this.name=name;
		this.address=address;
		this.tel=tel;
	}
	
	//접근자, 설장자 메소드 
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}
	//정보를 출력하는 메소드
	@Override
	public String toString() {
		return "이름: " + name + ", 주소: " + address + ", 전화번호: " + tel;
	}
}

//customer 클래스 (Person 상속)
class Customer extends Person{
	private int gestNum; 
	private int Mileage;
	
	//디폴트 생성자
	public Customer() {}
	//생성자
	public Customer(String name, String address, String tel, int gestNum, int Mileage) {
		super(name, address, tel); //부모 클래스의 생성자 호출
		this.gestNum=gestNum;
		this.Mileage=Mileage;
	}
	
	public int getGestNum() {
		return gestNum;
	}
	
	public void setGestNum(int gestNum) {
		this.gestNum = gestNum;
	}
	
	public int getMileage() {
		return Mileage;
	}
	
	public void setMileage(int mileage) {
		Mileage = mileage;
	}
	
	//정보를 출력하는 메소드
	@Override
	public String toString() {
		return super.toString() + ", 고객번호: " + gestNum + ", 마일리지: " + Mileage;
	}
}
	
//테스트 클래스
public class TestPerson{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Person 객체 생성
		Person person = new Person("조유빈","부산시 수영구","010-6649-8606");
		
		//Customer 객체 생성
		Customer customer = new Customer("임성빈","서울시 강남구","010-1234-5678",1004,9999);
		
		System.out.println(person);
		System.out.println(customer);
	}

}


