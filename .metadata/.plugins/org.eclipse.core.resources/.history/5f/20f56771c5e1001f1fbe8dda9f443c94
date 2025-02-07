package Packagepro;

class Score{
	private int sno;
	private String name;
	private String dept;
	private int[] scores;
	private double avg;
	private int rank=1;
	
	public Score(int sno, String name, String dept, int[]scores) {
		this.sno=sno;
		this.name=name;
		this.dept=dept;
		this.scores=scores;
	}
	public void total_avg() {
		int total = 0;
		for(int i=0; i<scores.length; i++) {
			total += scores[i];
		}
		avg = (double)total/scores.length;
	} 
	
	public double getAvg() { 
		return avg;
	}
	public void setRank(int rank) { //rank는 값을 받아 추가하기 때문에 set
		this.rank = rank;
	}
	
	public void display() { //보이는 형식을 한번에 출력할 수 있게 display
		System.out.printf("%d, %s, %s, ", sno, name, dept);
		for(int i=0; i<scores.length; i++) {
			System.out.printf("%d, ", scores[i]);
		}
		System.out.printf("%5.2f, %d%n", avg, rank); //5번째 자리, 2자리 소수점까지 , %d(정수)%n(줄바꿈)
	}
}

public class ScoreEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Score[] arrayScore = new Score[3];
		int[] scores1 = {90,80,75};
		arrayScore[0] = new Score(1, "kim","컴공",scores1);
		arrayScore[0].total_avg();
		int[] scores2 = {80,80,75};
		arrayScore[1] = new Score(2, "lee","컴멀",scores2);
		arrayScore[1].total_avg();
		int[] scores3 = {70,80,75};
		arrayScore[2] = new Score(3, "park","정보통신",scores3);
		arrayScore[2].total_avg();
		
		//모든값의 평균이 다 정해진 후에 rank를 구할 수 있다.
		for(int i=0; i<arrayScore.length; i++) {
			int rank = 1; //rank는 1부터 시작
			for(int j=0; j<arrayScore.length;j++) {
				if(arrayScore[i].getAvg()<arrayScore[j].getAvg()) {
					rank++; //랭크를 구할 사람의 평균값 < 다른사람의 평균값
				}
			}
			arrayScore[i].setRank(rank);
		}
		
		for(int i=0; i<arrayScore.length; i++) {
			arrayScore[i].display();
			
		}
		
	}

}
