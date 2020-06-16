package day07;

public class PointMain extends Point {
	private String color;

	public PointMain (int x, int y, String color) {
		super(x,y); //x,y�� �ִ� �θ��� �����ڸ� �ҷ��ش�.
		this.color=color;
	}
	//���� ��½�Ű�� �ʹٸ� ��ǥ�� ��½�Ű�� �θ��� disp()�޼ҵ带 �������̵� ���ָ� �ȴ�.
	//�θ��� ���ڰ� ����Ϸ��� super�� ���̸� ��.
	@Override //������̼�. ������ �Ҷ� �˷���. �̸��� �޶����� �����߻�. �������̵尡 �ƴϰ� �ǹǷ�.
	public void disp() {
		// TODO Auto-generated method stub
		super.disp();
		System.out.println("Color: "+color);
	}
	public static void main(String[] args) {
		PointMain pm=new PointMain(5,5,"Yellow");
		pm.disp();
		pm.move(10,20);
		pm.disp();	
		
		System.out.println(pm.str);
		
	}
}