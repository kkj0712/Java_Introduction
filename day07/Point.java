package day07;

public class Point {
	private int x;
	private int y;
	protected String str="Point"; //protected�� ��Ӱ����� ����������. 
	
	//���ھ��� �����ڸ� ������� ��. ������
	Point(){}
	
	public Point(int x, int y) {
		this.x=x;
		this.y=y;
	}
	
	public void disp() {
		System.out.println("��(x,y)=("+x+","+y+")");
	}
	
	public void move(int x, int y) {
		this.x=x;
		this.y=y;
	}
}