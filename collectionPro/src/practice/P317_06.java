package practice;

//	 6) 고객의 이름과 포인트 점수를 관리하는 프로그램을 해시맵을 이용하여 작성하라
//		이 프로그램은 고객의 이름과 포인트를 누적하여 관리한다. 한 고객의 입력이 끝나면 현재까지의 모든 고객의 포인트 점수를 출력한다.
//		** 포인트 관리 프로그램입니다 **
//		이름과 포인트 입력 >> 황기태 40
//		(황기태,40

import java.util.Map.Entry;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;

public class P317_06 {
  
		public static void main(String[] args) {
	        // TODO Auto-generated method stub
	        
//	        해쉬맵 선언
	        HashMap<String, Integer> pointDB = new HashMap<>();
	        Scanner sc = new Scanner(System.in);
	        
//	        이름, 포인트 5개 입력받기
	        System.out.println("** 포인트 관리 프로그램입니다. **");
	        while(true) {
	            System.out.print("이름과 포인트 입력>>");
	            //이름 입력
	            String name = sc.next();
	        
	            // exit 입력시 종료
	            if(name.equals("exit")) {
	                System.out.println("프로그램을 종료합니다...");
	                break;
	            }
	            //포인트 입력
	            int point = sc.nextInt();
	            
	            
	            
	            //해쉬맵에 값 입력
	                //중복이름일 경우
	                if(pointDB.containsKey(name)) {
	                    pointDB.put(name, pointDB.get(name) + point);
	                }else {
	                //중복이름이 아닐 경우
	                    pointDB.put(name, point);
	                }
	            //현재까지 저장된 모든 해쉬맵 출력
	                // 해쉬맵은 순서가 없기때문에 Iterator활용하기
	                //모든 키를 set으로 저장
	            Set<String> keys = pointDB.keySet();
	                //저장한 set을 iteratior로 읽어 나갈 수 있게 만들기
	            Iterator<String> it = keys.iterator();
	            
	                //iterator를 읽어가며 모든 값 출력
	            while(it.hasNext()) {
	                String key = it.next();
	                int value = pointDB.get(key);
	                System.out.print("("+ key + "," + value + ")" );
	            }
	            System.out.println();
	        }
	        
	    }

	}
	
//	Scanner scanner = new Scanner(System.in);
//	        HashMap<String, Integer> points = new HashMap<>();
//	        
//	        System.out.println("** 포인트 관리 프로그램입니다 **");
//	        
//	        while(true) {
//	            System.out.print("\n이름과 포인트 입력 >> ");
//	            String input = scanner.nextLine();
//	            if(input.equals("exit")) break;
//	            
//	            StringTokenizer st = new StringTokenizer(input, " ");
//	            String name = st.nextToken();
//	            int point = Integer.parseInt(st.nextToken());
//	            if(points.containsKey(name)) points.replace(name, points.get(name) + point);
//	            else points.put(name, point);
//	            
//	            Set<Entry<String, Integer>> entries = points.entrySet();
//	            Iterator<Entry<String, Integer>> entriesIt = entries.iterator();
//	            while(entriesIt.hasNext()) {
//	                Entry<String, Integer> curEntry = entriesIt.next();
//	                System.out.print("(" + curEntry.getKey()
//	                        + ", " + curEntry.getValue() + ") ");
//	            }
//	        }
//	        
//	        System.out.println("프로그램을 종료합니다...");
//	        scanner.close();
//        
//    }
//
//}