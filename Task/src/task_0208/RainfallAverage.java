package task_0208;

import java.util.Scanner;
import java.util.Vector;

//2. Vector 컬렉션을 이용하여 강수량의 평균을 유지관리하는 프로그램을 작성하라.
// 강수량을 입력하면 벡터에 추가하고 현재 입력된 모든 강수량의 평균을 출력하라.
//---------------------------------------------
//강수량 입력(0 입력시 종료)>>5
//        5
//현재 평균 : 5
//강수량 입력(0 입력시 종료)>>80
//        5 80
//현재 평균 : 42
//강수량 입력(0 입력시 종료)>>53
//        5 80 53
//현재 평균 46
//강수량 입력(0 입력시 종료)>>22
//        5 80 53 22
//현재 평균 40
//강수량 입력(0 입력시 종료)>>0
//End
public class RainfallAverage {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Vector<Integer> rainfallData = new Vector<>();

        while (true){
            System.out.print("강수량 입력(0 입력시 종료)>>");
            int rainfall = sc.nextInt();

            if(rainfall == 0){
                System.out.println("End");
                break;
            }
            rainfallData.add(rainfall); //강수량을 백터에 추가

            double sum = 0;
            for(int data : rainfallData){
                sum += data;
            }
            double average = sum / rainfallData.size();

            for(int data : rainfallData){
                System.out.print(data+" ");
            }
            System.out.println();
            System.out.printf("현재 평균 : %.0f\n",average);
        }
        sc.close();

    }
}
