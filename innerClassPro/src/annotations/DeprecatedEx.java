package annotations;

interface Unit5{
	@Deprecated
	public void move(String str);
	public void run(String str);
}

class Human5 implements Unit5{

	@Override
	public void move(String str) {
		// TODO Auto-generated method stub
		System.out.println(str);
	}

	@Override
	public void run(String str) {
		// TODO Auto-generated method stub
		System.out.println(str);
	}
	
}
public class DeprecatedEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Unit5 unit = new Human5();
		unit.move("인간형 유닛이 이동합니다.");
		unit.run("인간형 유닛이 달립니다.");
	}

}
