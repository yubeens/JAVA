package streamPro;

import java.io.FileWriter;
import java.io.IOException;
//import java.io.InputStreamReader;

public class FileWriterEx01 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
//        InputStreamReader in = new InputStreamReader(System.in);
        FileWriter fout = null;
//        char[] cbuf = {'a', 'b', 'c', '!'};
        String st ="가나다라";
//        int c;
        try {
            fout = new FileWriter("D:\\JMT\\JAVA\\workspace\\test2.txt");
            fout.write(st);
//            fout.write(cbuf);
            
//            while((c=in.read()) != '0') {
//                fout.write(c);
//            }
//            in.close();
            fout.close();
        }catch(IOException e) {
            System.out.println("입출력 오류");
        }
    }

}