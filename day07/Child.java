package day07;

public class Child extends Father { //Child�� Father�� �� �� �� �ִ�. ��ӹ޴´�.
	//�̹� ������� �ִ°� ���� �� �� �ֱ� ������ �ߺ��� �ּ�ȭ �� �� �ִ�. �ڵ尡 ��������.
	//��� �޾ұ� ������ ������ �����ڸ� ���� �����ϰ� �ڽ��� �޼ҵ带 ����
	//�ڹٿ��� ���߻���� �ȵǰ� ���ϻ�Ӹ� �ȴ�.

	public Child() {
//		super("�θ� ȣ��"); //super();�� �θ��� �����ڸ� �θ��� ��. ���� �����ϴ�.
		//super(����); 
		System.out.println("�ڽ� ������");
	}
	
	public void childPrint() {
		System.out.println(super.str); //this�� �ڱ� �ڽ��� ��ü�� �ҷ��� ��ó��, ��ȣ ���� super�� �θ��� ��ü�� �θ���.
		System.out.println("child print �޼ҵ�");
	}
	
	public void test() {
		System.out.println("test method");
	}
}
