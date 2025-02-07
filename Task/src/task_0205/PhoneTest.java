package task_0205;

//	 4) 일반적인 휴대폰을 나타내는 Phone 클래스를 작성한다. Phone 에는 제조사, 가격, 통신타입(2g 또는 3g) 등의 정보가 저장되어 있다.
//		Phone 에서 상속받아서 SmartPhone 클래스를 작성하여 보자. SmartPhone 클래스에는 운영체제 타입, 운영체제 버전, 내부 메모리크기, 
//		카메라 장착 여부, 블루투스 지원 여부 등의 필드가 추가된다. 생성자, 접근자, 설정자를 포함하여서 각각의 클래스를 작성한다.
//		이들 클래스들의 객체를 만들고 각 객체의 모든 정보를 출력하는 테스트 클래스를 작성하라.

class Phone{
	 private String company;
	 private double price;
	 private String networkType; // 2g or 3g
	 
	 public Phone(String company, double price, String networkType) {
		 this.company=company;
		 this.price=price;
		 this.networkType=networkType;
	 }

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		company = company;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		price = price;
	}

	public String getNetworkType() {
		return networkType;
	}

	public void setNetworkType(String networkType) {
		this.networkType = networkType;
	}
	 
	public void displayInfo() {
		System.out.println("COMPANY: "+company);
		System.out.println("PRICE: "+price);
		System.out.println("NETWORKTYPE: "+networkType);
	}
}


//smartphone 클래스 (phone을 상속)
class SmartPhone extends Phone{
	private String osType;
	private String osVersion;
	private int inMemory;
	private boolean hasCamera;
	private boolean supprotsBluetooth;
	
	public SmartPhone(String company, double price, String networkType, String osType,
			String osVersion, int inMemory, boolean hasCamera, boolean supprotsBluetooth) {
		super(company, price, networkType);
		this.osType = osType;
		this.osVersion = osVersion;
		this.inMemory = inMemory;
		this.hasCamera = hasCamera;
		this.supprotsBluetooth = supprotsBluetooth;
	}

	public String getOsType() {
		return osType;
	}

	public void setOsType(String osType) {
		this.osType = osType;
	}

	public String getOsVersion() {
		return osVersion;
	}

	public void setOsVersion(String osVersion) {
		this.osVersion = osVersion;
	}

	public int getInMemory() {
		return inMemory;
	}

	public void setInMemory(int inMemory) {
		this.inMemory = inMemory;
	}

	public boolean isHasCamera() {
		return hasCamera;
	}

	public void setHasCamera(boolean hasCamera) {
		this.hasCamera = hasCamera;
	}

	public boolean isSupprotsBluetooth() {
		return supprotsBluetooth;
	}

	public void setSupprotsBluetooth(boolean supprotsBluetooth) {
		this.supprotsBluetooth = supprotsBluetooth;
	}

	@Override
	public void displayInfo() {
		// TODO Auto-generated method stub
		super.displayInfo();
		System.out.println("osType: "+osType);
		System.out.println("osVersion: "+osVersion);
		System.out.println("inMemory: "+inMemory);
		System.out.println("hasCamera: "+hasCamera);
		System.out.println("supprotsBluetooth: "+supprotsBluetooth);
	}
}
//test class
public class PhoneTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Phone basicPhone = new Phone("Nokia",50.0,"2G");
		SmartPhone smartPhone = new SmartPhone("Samsung",999.999,"5G","Android","13.0",128,true,true);
											//제조사, 가격, 네트워크 형식, 운영체제타입, 운영체제버전, 메모리, 카메라여부,블루투스지원
		System.out.println("==Basic Phone Info==");
		basicPhone.displayInfo();
		
		System.out.println("==Smart Phone Info==");
		smartPhone.displayInfo();
	}

}
