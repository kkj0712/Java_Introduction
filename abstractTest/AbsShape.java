package abstractTest;

public abstract class AbsShape {
	/*
	 *�׸���. ���� �׸��� ���� �׸���. �簢���� �׸��� �簢���� �׸���. 
	 *�ڽ� Ŭ�����鿡 ���� �����ǵ���. 
	 *�׷����� �߻� �޼ҵ带 �������� Ŭ������ �߻�Ŭ������ ���ϰ�.
	 */
	public abstract void draw();
	//�̵��ϴ�
	public abstract void move();
	
	public void print() {
		System.out.println("�����׸���");
	}
	
}
