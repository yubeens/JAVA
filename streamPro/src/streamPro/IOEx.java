package streamPro;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class IOEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileReader fr;
		FileWriter fw;
		
		try {
			fr=new FileReader("C:\\Share_Java_WorkSpace\\test.txt");
			fw=new FileWriter("C:\\Share_Java_WorkSpace\\test3.txt");
			int c;
			while((c=fr.read())!=-1) {
				fw.write(c);
			}
			fr.close();
			fw.close();
		}catch(IOException e) {
			System.out.println("파일 입출력 오류");
		}
	}

}
