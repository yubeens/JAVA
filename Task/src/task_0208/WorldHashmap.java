package task_0208;
//1. “그만”이 입력될 때까지 나라의 이름과 인구를 입력받아 저장하고 다시 나라의 이름을 입력하면 인구를
//출력하는 프로그램을 작성하시오. 다음의 해시맵을 이용하라.
// HashMap<String, Integer> nations =new HashMap<String, Integer>();
// _____________________________________________________
//나라이름과 인구를 입력하세요. (예 : Korea 5000)
//나라 이름, 인구>> Korea 5000
//나라 이름, 인구>> USA 10000
//나라 이름, 인구>> Swiss 2000
//나라 이름, 인구>> France 3000
//나라 이름, 인구>> 그만
//인구 검색 >> France
// France 인구는 3000
//인구 검색 >> 스위스
//스위스 나라는 없습니다.
//인구 검색>>그만
//End----------------------------------------------------
import java.io.Serial;
import java.util.HashMap;
import java.util.Scanner;

public class WorldHashmap{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, Integer> nations = new HashMap<>();
        System.out.println("나라이름과 인구를 입력하세요. (예: Korea 5000)");

        while(true){
            System.out.print("나라 이름,인구>>");
            String input = sc.nextLine();

            if(input.equals("그만")){
                break;
            }
            //입력을 나누어서 나라이름과 인구로 분리
            String[] parts = input.split(" ");
            String country = parts[0];
            int population = Integer.parseInt(parts[1]);

            nations.put(country, population); //해시맵에 나라이름과 인구 저장
        }
        while(true){
            System.out.print("인구 검색>> ");
            String serchCountry = sc.nextLine();

            if(serchCountry.equals("그만")){
                break;
            }

            if(nations.containsKey(serchCountry)){
                System.out.println(serchCountry+" 인구는 "+nations.get(serchCountry));
            }else {
                System.out.println(serchCountry+" 나라는 없습니다.");
            }
        }
        System.out.println("End");
        sc.close();
    }
}
