package inheritance;

public class Product {
	protected int price;
	protected int bonusPoint;
	
	/* �����ڸ� ����� �׻� �θ��� �����ڷ� ���� ����. 
	 * �θ��� ������ Product�� ���ڰ� ����. 
	 * �ڽ� Ŭ������ ���ڰ� ���� �����ڵ��� �־���.
	 * (BuyerŬ������ ���� ���� Ŭ������ ���ڰ� �ִ� �����ڷ� �ٲٸ鼭 ����)
	 * �׷��� �Ȱ��� ���ڰ� ���� Product�� ����������.
	public Product() {
		
	}
	*/
	public Product(int price) {
		this.price=price;
		bonusPoint=price/10;
	}	
}