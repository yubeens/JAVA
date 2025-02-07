package aaa;

import bbb.TestC;

public class PackageTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestA a = new TestA();
		TestB b = new TestB();
		TestC c = new TestC();
//		TestD d = new TestD();

		//같은 패키지 안이라 접근가능
			a.func1(); 
			a.func2();
			b.func1();
			b.func2();

	}

}