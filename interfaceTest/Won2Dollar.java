package interfaceTest;

public class Won2Dollar extends Converter {
	public Won2Dollar(int don) {
		super.ratio=don;
	}
	@Override
	protected double convert(double src) {
		//src/don�̶�� �ϸ� don�� ���� �𸣴ϱ� �θ�Ŭ������ ratio�� �ְ� �װ� ������ ��
		return src/ratio; 
	}
	@Override
	String srcString() {
		return "��";
	}
	@Override
	String destString() {
		return "�޷�";
	}
}