package stringPro;

public class StringEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ss="";
		for(int i=0; i<100; i++) {
			ss+=i;
		}
		String a=" abcd\t";
		String b="java";
		String c=a.concat(b);
		String d=c.replace("java", "python");
		String s1="java,program,python";
		System.out.println(s1.indexOf(",")); //","의 위치를 숫자로 출력
		System.out.println(s1.lastIndexOf(",")); //맨 마지막에 있는 ","의 위치를 숫자로 출력
		System.out.println(s1.substring(s1.indexOf(",")+1,s1.lastIndexOf(","))); //첫번째 ","위치 +1 부터 ~ 마지막 ","까지의 문자열 출력
		
		String[] arr=s1.split(",");
		String s2=s1.substring(5,8); //start , end위치 앞까지
		
		System.out.println("s2="+s2); 
		System.out.println(s1.charAt(0)); //첫번째 문자열을 캐릭터화 시켜 추출
		System.out.println(s1.charAt(1)); //두번째 문자열을 캐릭터화 시켜 추출
		System.out.println(s1.codePointAt(1)); //s1의 문자열의 두번째 (a)의 코드를 출력
		System.out.println("arr[0]"+arr[0]);
		System.out.println("arr[1]"+arr[1]);
		System.out.println(d);
		System.out.println(c);
		System.out.println(a.length());
		System.out.println(b.length());
		System.out.println("|"+a+"|");
		System.out.println("|"+a.trim()+"|"); //trim : 공백제거 - 스트링 앞 뒤에 있는 공백 제거
		
	}

}