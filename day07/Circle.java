package day07;

public class Circle extends Shape {
	private int r;
	final double PI=3.14;
	
	public Circle(int x, int y, int r) {
		super(x,y);
		this.r=r;
	}
	//�������̵�
	public void print() {
		super.print();
		System.out.println("������: "+r);
	}
	//�������̵�
	
	public double getArea() {
		return r*r*PI;
	}
	
}
