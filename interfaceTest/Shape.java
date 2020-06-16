package interfaceTest;

public interface Shape {
	int a=5; //interface�� ����Ǵ� �������� final�� �����ȴ�. 
	double area(); //����
	double circum(); //�ѷ�	
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
		//Math�� ������ ����� �Ϸ�� Ŭ����.
		//��������� PI�� �� �� �ϳ�.
		return r*r*Math.PI; 
	}
	public double circum() {
		return 2*r*Math.PI;
	}
}