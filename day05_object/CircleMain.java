package day05_object;

class Circle {
	String name;
	int r;
	
	public Circle() { //����Ʈ ������
	}
	
	public Circle(int r) { //�����ε�
		this.r=r; 
	}
	
	public void getArea() {
		System.out.println(name+"�� �������� "+r+"�� �� ����: "+(r*r*3.14));
	}
	
	public void setR(int r) {
		this.r=r; //�ʱⰪ�� ��������ش�.
	}
	
	public Circle(int r, String name) { //�����ε�
		this.name=name;
		this.r=r; 
	}
	
}
	
public class CircleMain {
	public static void main(String[] args) {
		Circle c1=new Circle();
		c1.name="����";
		c1.r=10;
		//������ ���̸� ���Ͻÿ�
		c1.getArea(); //������ ������?
		c1.setR(8); //������ �������� 8�� �����
		c1.getArea();
		
		Circle c2=new Circle();
		c2.name="������";
		c2.r=2;
		c2.getArea();
		
		//�������� 5�� �����ڸ� �̿��ؼ� ��ġ�� ������ ���Ͻÿ�
		Circle c3=new Circle(5);
		c3.name="��ġ��";
		c3.getArea();
		
		//�ʱⰪ���� �������� 4, �����̶� �̸��� ���� �����ڸ� �̿��� ���� ����
		Circle c4=new Circle(4, "����");
		c4.getArea();
		
		//������ Circle ��ü�� �� ������ ���Ͻÿ�
		
		
	}
	
}