package streamPro;

import java.io.FileReader;
import java.io.IOException;
//import java.io.InputStreamReader;

public class IOEx01 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

//        InputStreamReader rd = new InputStreamReader(System.in);

        try {
            FileReader fin = new FileReader("D:\\JMT\\JAVA\\workspace\\test.txt");
            int c;
            char[] cbuf = new char[2];
            while((c=fin.read(cbuf, 0, cbuf.length))!=-1) { //read(저장용량설정, 어디부터, 어디까지)
                System.out.println(c+ " " + cbuf);            //c는 글자수 실제 데이터는 cbuf에 저장
                
                for(int i =0 ; i <c; i++) {
                    System.out.print(cbuf);
                    System.out.println();
                }
                
                
//                for(char ch : cbuf) {            //cbuf를 하나씩 읽어서 ch에 저장하겠다?(for-each문 또는 향상된 for문)
//                    System.out.print(ch);
//                }
//                System.out.println();
//                int c = fin.read();  //글자 한개를 읽어 오겠다는 의미
//                if(c==-1) {
//                    break;
//                }
//                System.out.println((char)c);
                
            }
            fin.close();
        }catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
        }       
                    
    }

}