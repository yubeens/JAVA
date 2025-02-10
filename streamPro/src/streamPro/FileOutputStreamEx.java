package streamPro;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte b[]= {7,51,3,4,-1,24};
		try {
			FileOutputStream fout = new FileOutputStream("C:\\Share_Java_WorkSpace\\test4.out");
			for(int i=0; i<b.length; i++) {
				fout.write(b[i]);
			}
			fout.close();
		}catch(IOException ex) {
			System.out.println("입출력 오류");
		}
	}

}
