package stringPro;

public class StringBufferEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s=new String("This");
		System.out.println(s.hashCode());
		s=s.concat(" is pencil");
		System.out.println(s.hashCode());
		
		StringBuffer sp=new StringBuffer("This"); //가변 스트링을 다루는 클래스
		System.out.println(sp.hashCode());
		sp.append(" is pencil");
		System.out.println(sp.hashCode());
		sp=sp.insert(7, " my");
		System.out.println(sp);
		sp=sp.replace(8, 10, "your");
		System.out.println(sp);
		System.out.println(sp.hashCode());
		String ss=sp.toString();
		System.out.println(ss);
	}

}
 