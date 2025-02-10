package streamPro;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamEx01 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
        char[] ch = {'1', '9', 'A', 'B', 'c', 'd', '가', '나', '다'};
        try {
            FileOutputStream fout =new FileOutputStream("C:\\Share_Java_WorkSpace\\test5.out");
            for(int i=0; i<ch.length;i++) {
                fout.write((byte)ch[i]);
            }
        
        }catch(IOException ex) {
            System.out.println("파일 입출력 오류");
        }
    }

}