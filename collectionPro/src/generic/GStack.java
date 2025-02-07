package generic;

public class GStack<T> { //제네릭 스택 선언, 제네릭 타입 T
	int tos;
	Object[] stack; //스택에 저장된 요소의 개수
	
	public GStack() {
		tos = 0;
		stack = new Object[10];
	}
	public void push(T item) {
		if(tos==10) //스택이 꽉 차서 더 이상 요소를 삽입할 수 없음
			return;
		stack[tos] = item;
		tos++;
	}
	public T pop() { 
		if(tos==0) //스택이 비어 있어 꺼낼 요소가 없음
			return null;
		tos--;
		return (T)stack[tos]; //타입 매개 변수 타입으로 캐스팅
	}

}
