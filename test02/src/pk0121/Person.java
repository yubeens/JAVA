package pk0121;

public class Person {
	private int weight;
	int age;
	protected int height;
	public String name;
	
	public void setWeight(int weight) {
		this.weight = weight;
		}
	public int getWeight() {
		return weight;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return age; //외부에서 접근할 수 있는 메소드를 생성
	}
}