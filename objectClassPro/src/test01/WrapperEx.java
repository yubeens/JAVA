package test01;

public class WrapperEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer i = Integer.valueOf(10);
		int i10=i.intValue();
		int i11=i;		
		System.out.println(i);
		
		String s10=Integer.toBinaryString(i10);
		System.out.println("s10="+s10); //정수 i를 이진수 표현으로 변환

		String s20=Integer.toHexString(i10);
		System.out.println("s20="+s20); //정수 i를 16진수 표현으로 변환);
		
		String s30=Integer.toString(i10);
		System.out.println("s30="+s30);
		
		String s40=Boolean.toString(false);
		System.out.println("s40="+s40); //문자열 false값 출력
		
		String s1="100";
		String s2="3.5";
		String s3="true";
		Boolean b1=Boolean.valueOf(s3);
		int i2=Integer.valueOf(s1);
		double d1=Double.valueOf(s2);
		double d=Double.parseDouble(s2);
		
		Integer ii=Integer.parseInt(s1);
		System.out.println(ii);
	}

}
