package day06_objectArray.arraylist;
 
public class Subject {
	private String name;
	private int scorePoint;
	int score;
	
	public Subject() {
		
	}
	
	public Subject(String name, int score) {
		this.name=name;
		this.score=score;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public int getScorePoint() {
		return scorePoint;
	}
	
	public void setScorePoint(int scorePoint) {
		this.scorePoint = scorePoint;
	}
	
}