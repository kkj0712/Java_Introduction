package interfaceTest;

public class InterfaceMain {
	
	public static void main(String[] args) {
		//�տ��� Rectangle, Circle���� �ƴϴ�. �θ�Ŭ������ �Ҹ�.
		Shape rec=new Rectangle(5,7);
		Shape circle=new Circle(5);
		//rec.a=5; //interface�� ����ֱ� ������ ������ �� ����.
		System.out.println(rec.a);
		
		System.out.println("�� ����: "+circle.area());
		System.out.println("�� �ѷ�: "+circle.circum());
		System.out.println("�簢�� ����: "+rec.area());
		System.out.println("�簢�� �ѷ�: "+rec.circum());
	}
}