package day05_object;

public class CircleBean {
	int r;
	final double PI=3.14; //final�� �տ� ������ ���
	
	public CircleBean(int r) {
		this.r=r;
	}
	public double getArea() {
		return r*r*PI;
	}
}