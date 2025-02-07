package practice;

import java.util.Scanner;
import java.util.Vector;

//	4)	한 어린이의 키를 2000년부터 2009년 사이에 1년 단위로 입력받아 벡터에 저장하라.
//		그리고 키가 가장 많이 자란 연도를 출력하라
//	  =>2000~2009년까지 1년 단위로 키(cm)를 입력
//	  >>120 122 125 130 139 160 169 173 175 179
//		가장 키가 많이 자란 년도는 2004년 21.0cm

public class P317_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<P317_04_Child> v = new Vector<>();
		Scanner sc = new Scanner(System.in);
		int year = 2000;
		
		System.out.println("2000~2009년까지 1년 단위로 키(cm)를 입력");
		for(int i=0; i<10; i++) {
			v.add(new P317_04_Child(year++,sc.nextInt()));
		}
		
		int index=0;
		int step=0;
		for(int i=1; i<v.size(); i++) {
			int n = v.get(i).getHeight()-v.get(i-1).getHeight();
			if(step<n) {
				step=n;
				index=i;
			}
		}
		P317_04_Child child = v.get(index);
		System.out.println("가장 키차이가 많이 나는 년도는 "+child.getYear()+" "+step+"cm");
			
		
//		for(int i=0; i<v.size(); i++) {
//			P317_04_Child c=v.get(i);
//			System.out.println(c.getYear()+","+c.getHeight());
		}    
		
		
		
		
	}

// <다른방법>

//		public static void main(String[] args) {
//	    
//	    	Scanner scanner = new Scanner(System.in);
//	    
//	    	Vector<Double> heights = new Vector<>();
//	    
//	    	System.out.println("2000~2009년까지 1년 단위로 키(cm)를 입력");
//	    	String input = scanner.nextLine();
//	    
//	    	StringTokenizer st = new StringTokenizer(input, " ");
//	    	while(st.hasMoreTokens()) {
//	      	  heights.add(Double.parseDouble(st.nextToken()));
//	   	 }
//	    
//	    	double maxGap = 0.0;
//	    	int maxYear = 0;
//	    	for(int i = 0; i < heights.size() - 1; i++) {
//	      	  double gap = heights.get(i + 1) - heights.get(i);
//	      	  int year = 2000 + i;
//	      	  if(maxGap < gap) {
//	       	     maxGap = gap;
//	       	     maxYear = year;
//	      	  }
//	   	 }
//	    
//	 	   System.out.println("가장 키가 많이 자란 년도는 " + maxYear + " " + maxGap+ "cm");
//	  	  
//	  	  scanner.close();
//	    	
//		}

