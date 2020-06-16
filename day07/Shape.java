package day07;

public abstract class Shape { //�߻�޼ҵ带 ���� �߻�Ŭ����. 
	//�߻� Ŭ������ ������ �͵� �ְ� �������� ���� �͵� �ִ�.
	private int x;
	private int y;
	
	public Shape(int x, int y) {
		this.x=x;
		this.y=y;
	}
	
	public void print() {
		System.out.println("��ǥ(x,y)=("+x+","+y+")");
	}
	
	/*
	public double getArea() {
		return 0.0;
	}
	*/
	
	public abstract double getArea(); //�̸��� �����ϰ� �޼ҵ带 �������� ����. ���� Ŭ�������� �����ϵ��� abstract�� �ٿ���.
	
}