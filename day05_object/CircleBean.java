package day05_object;

public class CircleBean {
	int r;
	final double PI=3.14; //final이 앞에 붙으면 상수
	
	public CircleBean(int r) {
		this.r=r;
	}
	public double getArea() {
		return r*r*PI;
	}
}