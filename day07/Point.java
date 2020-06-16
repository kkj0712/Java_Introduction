package day07;

public class Point {
	private int x;
	private int y;
	protected String str="Point"; //protected는 상속관계의 접근제어자. 
	
	//인자없는 생성자를 만들어준 것. 껍데기
	Point(){}
	
	public Point(int x, int y) {
		this.x=x;
		this.y=y;
	}
	
	public void disp() {
		System.out.println("점(x,y)=("+x+","+y+")");
	}
	
	public void move(int x, int y) {
		this.x=x;
		this.y=y;
	}
}