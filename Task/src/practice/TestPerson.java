package practice;

//person클래스를 작성하라
class Person{
	//이름,주소,전화번호를 필드로 가진다
	private String name;
	private String address;
	private String tel;
	
	//하나 이상의 생성자를 정의하고 
	public Person(String name, String address, String tel) {
		this.name = name;
		this.address = address;
		this.tel = tel;
	}
	//각 필드에 대하여 접근자와 설정자 메소드를 작성하라

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
	
	//정보 출력 메소드
	@Override
	public String toString() {
		return "이름: " + name + ", 주소: " + address + ", 전화번호: " + tel;
	}
	
}


//Person을 상속받아서 Customer를 작성하여 보자
class Customer extends Person{
	//고객 번호와 마일리지를 필드로 가지고 있다
	private int pno;
	private int mileage;
	
	//한 개 이상의 생성자를 작성하고
	public Customer(String name, String address, String tel, int pno, int mileage) {
		super(name, address, tel); //부모 클래스의 생성자 호출
		this.pno = pno;
		this.mileage = mileage;
	}
	//적절한 접근자 메소드와 설정자 메소드를 작성한다.	
	public int getPno() {
		return pno;
	}

	public void setPno(int pno) {
		this.pno = pno;
	}

	public int getMileage() {
		return mileage;
	}

	public void setMileage(int mileage) {
		this.mileage = mileage;
	}
	
	//정보 출력 메소드
	@Override
	public String toString() {
		return super.toString() + " 고객번호: " + pno + ", 마일리지: " + mileage ;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//이름,주소,전화번호/고객번호,마일리지
		Person person = new Person("조유빈","부산시 수영구 광안1동","010-6649-8606");
		Customer customer = new Customer("임성빈","서울시 강남구 논현동","010-1234-5678",0001,4000);
		
		System.out.println(person);
		System.out.println(customer);
	}
	



	
}
