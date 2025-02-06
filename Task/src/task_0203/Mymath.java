package task_0203;

//	public class Mymath {
//		public int getRandom() {
//			return(int)Math.random();
//		}
//		public double getRandom() {
//			return Math.random();
//		}
//	}

//오버로딩 (overloading) : 같은 이름의 메서드를 여러 개 정의하는 것
//						메서드 이름은 같아야 하며 매개변수(개수,타입,순서)중 하나 이상이 달라야 함.
//						반환 타입(return type)만 다르면 오버로딩이 안됨.

//getRandom()은 둘 다 매개변수가 없으며, 매서드이름과 매개변수의 조합이 같아 오버로딩이 불가
//이미 같은 메서드가 존재한다는 오류 즉, 
//1. 매개변수를 다르게 해서 오버로딩하거나 , 2.메서드 이름을 다르게 바꾸기


//1. 매개변수를 다르게 하기
//	public class Mymath{
//		public int getRandom(int max) { //정수 반환 (0~max-1)
//			return (int)(Math.random()*max);
//		}
//		public double getRandom() { //실수 반환 (0.0~1.0)
//			return Math.random();
//		}
//	}

//2.메서드 이름을 다르게 바꾸기
public class Mymath{
	public int getRandomInt() { //정수 반환
		return (int)Math.random();
	}
	public double getRandomDouble() { //실수 반환
		return Math.random();
	}
}
						