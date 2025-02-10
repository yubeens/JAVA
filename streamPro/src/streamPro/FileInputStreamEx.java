package streamPro;


import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte[] b = new byte[100]; //비어 있는 byte 배열
		try {
			//C:/Share_Java_WorkSpace/test.out 파일을 읽어 배열 b에 저장
			FileInputStream fin = new FileInputStream("C:/Share_Java_WorkSpace/test4.out");
			int n=0;
			int c;
			while((c=fin.read())!=-1) { //-1은 파일 끝(EOF)
				System.out.print((byte)c+" ");
				b[n]=(byte)c; //읽은 바이트를 배열에 저장
				n++;
			}
			System.out.println();
			System.out.println("test4.out에서 읽은 배열을 출력");
			for(int i=0; i<n; i++) {
				System.out.print(b[i]+" ");
			}
			System.out.println();
			
			fin.close();
			
		}catch(IOException ex) {
			System.out.println("파일입력 오류");
		}
	}

}
