package interfaceTest;

public interface Shape {
	int a=5; //interface에 선언되는 변수들은 final로 지정된다. 
	double area(); //넓이
	double circum(); //둘레	
}

class Rectangle implements Shape{
	private int w, h;
	public Rectangle(int w, int h) {
		this.w=w;
		this.h=h;
	}
	public double area() {
		return w*h;
	}
	public double circum() {
		return (w+h)*2;
	}
}

class Circle implements Shape{
	private int r;
	public Circle (int r) {
		this.r=r;
	}
	public double area() {
		//Math는 수학적 계산이 완료된 클래스.
		//멤버변수로 PI가 그 중 하나.
		return r*r*Math.PI; 
	}
	public double circum() {
		return 2*r*Math.PI;
	}
}