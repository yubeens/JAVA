package annotations;

interface Unit4{
	public void move(String str);
}

class Human4 implements Unit4{

	@Override
	public void move(String str) {
		// TODO Auto-generated method stub
		System.out.println(str);
	}
	
}

public class OverrideEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Unit4 unit = new Human4();
		unit.move("인간형 유닛이 이동합니다.");
	}

}
