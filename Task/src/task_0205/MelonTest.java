package task_0205;

//	3) 일반적인 음식을 나타내는 Food 클래스를 상속받아서 멜론을 나타내는 Melon 클래스를 작성하여 보자.
//	   Food 클래스는 칼로리, 가격, 중량 등의 정보를 가진다. Melon 클래스는 추가로 경작 농원 정보를 가진다.
//	   생성자, 접근자, 설정자를 포함하여서 각각의 클래스를 작성한다. 
//     이들 클래스들의 객체를 만들고 각 객체의 모든 정보를 출력하는 테스트를 작성하라


class Melon extends Food{
	private String info; //경작 농원 정보

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	@Override
	public String toString() {
		return "멜론 [칼로리: " + getCal() + "kacl, 가격: " + 
				getCost() + "원, 중량: " + getKg() + "kg, 경작 농원 정보: " + getInfo() + "]";
	}
	
}
//food 클래스
class Food{
	private int cal;
	private int cost;
	private int kg;
	
	public int getCal() {
		return cal;
	}
	public void setCal(int cal) {
		this.cal = cal;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public int getKg() {
		return kg;
	}
	public void setKg(int kg) {
		this.kg = kg;
	}
	
}


public class MelonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Melon melon1 = new Melon();
		
		melon1.setCal(150);
		melon1.setCost(10000);
		melon1.setKg(1);
		melon1.setInfo("고산 농원");
		
		System.out.println(melon1);
	}

}
