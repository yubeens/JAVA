package pk0121;

class A{
	public A() {
		System.out.println("생성자A");
	}
	public A(int x) {
		System.out.println(x);
	}
}
class B extends A{
	//public B() {}
	public B(int x) {
		super(x);
		System.out.println("생성자B");
	}
}
class C extends B{
	//public C() {} 상속받는 부모클래스의 디폴트생성자가 있어야 호출 가능
	public C(int x) {
		super(x);
		System.out.println("생성자C");
	}
}
public class ConstructorEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C c = new C(1);
		
		
		
		
		
	}

}
