package task_0203;

//	public class MyClass {
//		private String getName() {
//			return "MyClass";
//		}
//		public static String getClassName() {
//			return getName();
//		}
//	}

//1.getName()을 static으로 변경하기
//	public class MyClass{
//		private static String getName() { //static 추가
//			return "MyClass";
//		}
//		public static String getClassName() {
//			return getName(); 
//		}
//	}

//2.getName()을 객체를 통해 호출하기
public class MyClass{
	private String getName() {
		return "MyClass";
	}
	public static String getClassName() {
		MyClass obj = new MyClass(); //객체 생성
		return obj.getName();
	}
}

//getName()메서드는 private이고, 비정적(인스턴트)메서드이다.
//즉, 객체를 생성해야만 호출할 수 있다.(new MyClass().getName()처럼)
//하지만 getClassName()메서드는 static이기 때문에 클래스 차원에서 호출 가능하다.
//static 메서드는 객체 없이도 호출할 수 있는 메서드이나, static메서드는 인스턴스메서드(getName())를 직접 호출할 수 없다.