package day07;

public abstract class Shape { //추상메소드를 가진 추상클래스. 
	//추상 클래스는 구현한 것도 있고 구현하지 않은 것도 있다.
	private int x;
	private int y;
	
	public Shape(int x, int y) {
		this.x=x;
		this.y=y;
	}
	
	public void print() {
		System.out.println("좌표(x,y)=("+x+","+y+")");
	}
	
	/*
	public double getArea() {
		return 0.0;
	}
	*/
	
	public abstract double getArea(); //이름만 지정하고 메소드를 구현하지 않음. 하위 클래스들이 구현하도록 abstract를 붙여줌.
	
}