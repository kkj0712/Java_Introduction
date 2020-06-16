package day05_object;

public class StudentBean {
	private String name;
	private int kor, eng, math;
	private int rank=1;
	
	public StudentBean(String name, int kor, int eng, int math) {
		this.name=name;
		this.kor=kor;
		this.eng=eng;
		this.math=math;
	}
	
	public String getName() {
		return name;
	}
	
	public int getRank() {
		return rank;
	}
	
	public int getTotal() {
		return kor+eng+math;
	}
	
	public double getAvg() {
		return getTotal()/3;
	}
	
	public void setRank(int rank) {
		this.rank+=rank;
	}
}