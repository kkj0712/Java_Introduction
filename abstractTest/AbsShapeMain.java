package abstractTest;

public class AbsShapeMain {
	public static void main(String[] args) {
		AbsCircle ac=new AbsCircle();
		ac.draw();
		ac.move();
		
		AbsSquare as=new AbsSquare();
		as.draw();
		as.move();
		as.print();
		
		//AbsShape ah=new AbsShape(); //�߻��̶� �ȵȴ�. �߻�Ŭ������ ��ü�� ������ �� ����. ����Ŭ�������� �ݵ�� �߻�Ŭ������ �߻� �޼ҵ� ����.
		AbsShape ah=new AbsCircle(); //�̷������� �����Ѵ�. 
	}
}
