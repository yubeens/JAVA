package test01;

public class InstanceofEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person jee = new Student();
		Person kim = new Professor();
		Person lee = new Researcher();
		
		//instanceof 앞의 값이 어떤 형인지 true,false로 알려주는 형식
		
		System.out.println(jee instanceof Person);
		System.out.println(jee instanceof Student);
		System.out.println(kim instanceof Student);
		System.out.println(kim instanceof Professor);
		System.out.println(kim instanceof Researcher);
		System.out.println(lee instanceof Professor);
//		System.out.println(3 instanceof int);
		System.out.println("java" instanceof String);
	}

}
