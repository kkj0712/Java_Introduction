package abstractTest;

public class AbsSquare extends AbsShape {
	public void draw() { //�ݵ�� �����������. �θ� Ŭ������ AbsShape�� �߻�Ŭ�����̱� ������ �� �ȿ� �ִ� �߻�޼ҵ带 �����ϵ��� �ؾ���.
		System.out.println("�簢�� �׸���");
	}
	public void move() {
		System.out.println("�簢�� �̵��ϱ�");
	}
}
