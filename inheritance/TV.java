package inheritance;

public class TV extends Product {
	
	public TV(int price) {
		super(price);
	}
	//toString�� Object�� ������ �޼ҵ��̱� ������ �������̵� �� �� �ִ�.
	//�������̵��� �����ν� �ּҰ� �ƴ϶� TV, Computer�� ���ڰ� �������� ��
	@Override
	public String toString() {
		return "TV";
	}	
}