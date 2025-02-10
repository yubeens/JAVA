package filetest;

import java.util.Arrays;

public class Student {
	private int sno;
	private String name;
	private int[] scores;
	private int total;
	private double avg;
	private int rank;
	
	public Student(int sno, String name, int[] scores) {
		this.sno = sno;
		this.name = name;
		this.scores = scores;
	}
	
	public void setTotal_avg() {
		this.total=0;
		for(int i=0; i<scores.length;i++) {
			this.total+=scores[i];
		}
		this.avg=this.total/scores.length;
	}
	
	public double getAvg() {
		return avg;
	}
	
	public void setRank(int rank) {
		this.rank=rank;
	}
	
	@Override
	public String toString() {
		return sno + " " + name + " " + Arrays.toString(scores) 
		+ " " + total+ "  " + avg + " " + rank;
	}
	
	
	

}
