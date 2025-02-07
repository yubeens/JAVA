package generic;

public class MyClassEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyClass<String> s = new MyClass<>();
		s.set("Hello");
		System.out.println(s.get()); //"hello" 출력
		
		MyClass<Integer> n = new MyClass<>(); 
		n.set(10);
		System.out.println(n.get()); //숫자 '5'출력
	}

}
