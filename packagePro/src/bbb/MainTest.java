package bbb;

import aaa.TestA;

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestA a = new TestA();

		
		//TestB b = new TestB(); 디폴트 클래스 지정자(한 파일 안에서만 쓰게 생성한)
		TestC c = new TestC();
		TestD d = new TestD();


			a.func2(); //fun1은 public x

		

	}

}
