package streamPro;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class IOEx02 {
    public static void main(String[] args) {
        try (FileReader fr = new FileReader("C:/windows/system.ini");
             FileWriter fw = new FileWriter("C:/Share_Java_WorkSpace/system.txt")) {
             
            char[] cbuf = new char[100];
            int len;
            
            while ((len = fr.read(cbuf)) != -1) {
                fw.write(cbuf, 0, len);
            }
            
        } catch (IOException e) {
            System.out.println("IO Error: " + e.getMessage());
        }
    }
}