package vargEx;

public class VargEx01 {
//	public static void show(String str) {
//		System.out.println(str);
//	}
//	public static void show(String str1, String str2) {
//		System.out.println(str1);
//		System.out.println(str2);
//	}
//	public static void show(String str1, String str2, String str3) {
//		System.out.println(str1);
//		System.out.println(str2);
//		System.out.println(str3);
//	}
	
//	가변인자--------------------------------------------
	
public static void showAll(String...varg) { //배열로 적용
	for(String s:varg) {
		System.out.printf("%s\t ",s);
	}
	System.out.println();
}

public static void showInt(int...varg) { //같은 형에 데이터가 여러개 있을 때 한번에 모아서 처리할 수 있다.
	for(int i:varg) {
		System.out.printf("%d ",i);
	}
	System.out.println();
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		showInt(10);
		showInt(10,20);
		showInt(10,20,30);
		showAll("abc");
		showAll("abcd","가나다");
		showAll("abcd","가나다","010-222-333");
	}

}
