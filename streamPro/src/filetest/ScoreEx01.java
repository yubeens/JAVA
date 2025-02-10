package filetest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class ScoreEx01 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        FileReader fr;
        BufferedReader br;
        FileWriter fw;
        BufferedWriter bw;
        Student[] students=new Student[5];


        try {
            fr=new FileReader ("C:/Share_Java_WorkSpace/data.txt");
            br=new BufferedReader(fr);
            fw=new FileWriter ("C:/Share_Java_WorkSpace/result.txt");
            bw=new BufferedWriter(fw);

            String s;
            int idx=0; 
            while((s=br.readLine())!=null) {
                String [] arr=s.split(" ");
//                System.out.println(Arrays.toString(arr));
                int sno=Integer.parseInt(arr[0]);
                String name =arr[1];
                int [] scores= new int[3];
                scores[0]=Integer.parseInt(arr[2]);
                scores[1]=Integer.parseInt(arr[3]);
                scores[2]=Integer.parseInt(arr[4]);
                students[idx] = new Student (sno,name,scores);
                students[idx].setTotal_avg();
                idx++;


            }
            for (int i=0; i<students.length; i++) {
                int rank=1;
                for(int j=0; j<students.length; j++) {
                    if(students[i].getAvg()<students[j].getAvg())
                        rank++;
                }
                students[i].setRank(rank);
                System.out.println(students[i]);
                bw.write(students[i].toString()+ "\n");
            }
            bw.flush();
            bw.close();
            br.close();
            fr.close();
            fw.close();



        }catch (IOException ex) {
            ex.printStackTrace();
            System.out.println("IO error");

        }


    }

}