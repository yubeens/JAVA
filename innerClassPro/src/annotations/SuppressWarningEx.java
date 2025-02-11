package annotations;
interface Unit6{
	@Deprecated
	public void move(String str);
	public void run(String str);
}

class Human6 implements Unit6{
	@Override
	@SuppressWarnings("deprecation")
	public void move(String str) {
		System.out.println(str);
	}
		
	@Override
	public void run(String str) {
		// TODO Auto-generated method stub
		System.out.println(str);
	}
	
}
public class SuppressWarningEx {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Unit6 unit = new Human6();
		unit.move("인간형 유닛이 이동합니다.");
		unit.run("인간형 유닛이 달립니다.");
	}

}
