package day04;

public class Car {
	String carKind;
	String carColor;
	int speed;
	
	//������. �ݵ�� Ŭ���� �̸����� ��������. void�� ������ �����ڰ� �ƴ϶� �޼ҵ�� �����ϱ⶧���� ���־���.
	//���ڰ� ���� �����ڸ� ����Ʈ �����ڶ�� ��. ����Ʈ �����ڸ� ����Ҷ��� ���� ��������. ������ �ٸ� �����ڰ� ���� ���� ���� �Ұ���.
	//�׷��� �ƹ��� �ϴ� ���� ������ ����Ʈ �����ڸ� �ϳ� �������.
	//�����ε�. ������ �����ε�. �����ڵ��� �̸��� ������ ���� ������ ������ ������ �ٸ���.
	
	public Car() {
		System.out.println("����Ʈ ������");
	}
	
	public Car(String carColor, String carKind) { //�Ű������� �ִ°� ������ ����Ʈ ������ ���� �Ұ���.
		this.carColor=carColor; 
		this.carKind=carKind;
		System.out.println("�����ִ� ������");
	}
	
	public void speedUp(int s) {
		speed+=s;
	}
	
	public void speedDown(int speed) { //speed�� ���������� �ǹ�.
		this.speed-=speed; //this�� �ڱ� �ڽ��� ��ü�� ����Ŵ. 6���� speed. this.speed�� ��������� �ǹ�
	}
	
	public void stop() {
		speed=0;
	}
	
	public static void main(String[]args) {
		Car mycar = new Car(); //��������. ���۷��� ����. ��ü�� �ּҰ��� ������. �ּҰ��� ã�ư��� ��ü�� ������ �������� ������ �� �ִ�.
		mycar.carKind="�ҳ�Ÿ";
		mycar.carColor="���";
		mycar.speedUp(100); //��ȣ�� �����ϱ� �޼���� ����. ��ȣ �ȿ� ���� �����Ƿ� speedUp�� �Լ��ȿ��� ������ �μ��� ������.
		System.out.println("�ӵ�: "+mycar.speed);
		System.out.println("color: "+mycar.carColor);
		mycar.stop();
		System.out.println("�ӵ�: "+mycar.speed);
		
		Car c1=new Car();
		c1.carKind="��ī";
		c1.carColor="������";
		c1.speedUp(80);
		System.out.println(c1.carKind+" �ӵ�: "+c1.speed);
		c1.speedDown(50);
		System.out.println(c1.carKind+" �ӵ�: "+c1.speed);
		System.out.println(c1);
		System.out.println(mycar);
		
		Car c2=new Car("��ȫ��","����"); //�տ� Car�� Ŭ����. �ڿ� Car�� ������. �ʱⰪ���� ��ȫ��, ������� �ʱⰪ�� ����. �ƿ� ���� ���ö����� ����.
		//������=������� �ʱ�ȭ
		System.out.println(c2.carColor);
		
		
		
	}
}
