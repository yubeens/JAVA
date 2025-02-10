package streamPro;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileReader fr; //파일입력
		FileWriter fw; //파일출력
		BufferedReader br; //버퍼사용: 여러 문자 데이터를 한 번에 처리하여 입출력 속도 향상
		BufferedWriter bw;
		
		try {
			fr = new FileReader("C:\\Share_Java_WorkSpace\\system.txt");
			br = new BufferedReader(fr);
			fw = new FileWriter("C:\\Share_Java_WorkSpace\\system2.txt");
			bw = new BufferedWriter(fw);
			
			String s;
			int i=1;
			while((s=br.readLine())!=null) { //파일에서 한 줄씩 읽음
				System.out.println(i+": "+s);
				bw.write(i+": "+s+"\n");
				i++;
			}
			bw.flush(); //buffer 내용을 비워서 출력
			br.close(); //buffer를 먼저 닫아줘야 함.
			fr.close();
			bw.close();
			fw.close();
			
		}catch(IOException ex) {
			System.out.println("IO error");
		}
	}

}
