package day07;

public class Square extends Shape {
	private int w,h;
	
	public Square(int x, int y, int w, int h) {
		super(x,y);
		this.w=w;
		this.h=h;
	}
	//�������̵�
	public void print() {
		super.print();
		System.out.println("�ʺ�: "+w);
		System.out.println("����: "+h);
	}
	//�������̵�
	public double getArea() { //���ϵ� ������ ���ƾ� �ϹǷ� double�� ������.
		return w*h; 
		//�θ� getArea()���� 0.0�� �����ϱ� ������ �������̵��� ���� w*h���� ������.
	}
	
}
