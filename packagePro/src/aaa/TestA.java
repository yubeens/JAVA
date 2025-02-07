package aaa;

class TestB{ //디폴트 클래스
	private int a;
	
	void func1() {
		a=10;
	}
	public void func2() { //디폴트 클래스 내부 -> public x 무용지물
		System.out.println("func2");
	}
}

public class TestA {
	void func1() {
		TestB b = new TestB();
		//b.a =10; - private는 같은파일이라도 접근안됨.
		b.func1(); //void 접근가능.
	}
	public void func2() {
		System.out.println("func2");
	}
	
}

