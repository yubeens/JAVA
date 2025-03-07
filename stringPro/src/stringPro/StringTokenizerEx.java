package stringPro;

import java.util.StringTokenizer;

public class StringTokenizerEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String query="name=kitae&addr=seoul&age=21,0";
		String[] arr=query.split("&"); //한개의 구분자로 구별할 땐 split이 편함.
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("--------------");
		//StringTokenizer이 split 보다 여러개의 토큰을 나눌 때 편함.
		StringTokenizer st=new StringTokenizer(query,"=&,"); //구분자로 인식 (=,&,=& ..)
		int count=st.countTokens();
		System.out.println("token count:"+count);
		
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
	}
}
