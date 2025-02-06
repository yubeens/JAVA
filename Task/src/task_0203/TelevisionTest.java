package task_0203;

class Television {
	private String model;
	void setModel(String b) { // 설정자
		model = b;
	}
	String getModel() { // void->String
		return model;
	}
}
	public class TelevisionTest {
		public static void main(String[] args) {
			Television t = new Television(); // ()을 붙여주어야 함!
			t.setModel("STV-101");
			String b = t.getModel(); // 객체 참조 변수 t를 적어주어야 함.
		}
}
